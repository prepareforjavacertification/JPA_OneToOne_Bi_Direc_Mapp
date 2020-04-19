package com.kalpana.atyourdoorstep.app;

import com.kalpana.atyourdoorstep.dao.UserCredentialDao;
import com.kalpana.atyourdoorstep.dao.UserDao;
import com.kalpana.atyourdoorstep.entity.UserCredential;
import com.kalpana.atyourdoorstep.entity.UserDetails;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AtYourDoorStep");
        EntityManager em = emf.createEntityManager();
        try {
            application.insertUserDetails(em);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }

    private static UserDetails getUserDetails() {
        UserDetails details = new UserDetails();
        details.setFullName("Robin Hood");
        details.setSysCreationDate(new Date());
        return details;
    }

    private void insertUserDetails(EntityManager em) {

        em.getTransaction().begin();
        UserDetails details = new UserDao(em).insertUserDetails(getUserDetails());
       new UserCredentialDao(em).insertUserCredential(getUserCredential(details));
        
        em.getTransaction().commit();
        System.out.println(details.getUserId());
    }

    private UserCredential getUserCredential(UserDetails details) {
        UserCredential credential = new UserCredential();
        credential.setUserDetails(details);
        credential.setUserName("Kalpana");
        credential.setUserPassword("123");
        return credential;
    }

}
