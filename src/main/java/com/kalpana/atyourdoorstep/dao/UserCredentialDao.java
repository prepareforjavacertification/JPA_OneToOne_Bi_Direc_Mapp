package com.kalpana.atyourdoorstep.dao;

import com.kalpana.atyourdoorstep.entity.UserCredential;
import javax.persistence.EntityManager;

public class UserCredentialDao {

    private final EntityManager em;

    public UserCredentialDao(EntityManager em) {
        this.em = em;
    }

    public UserCredential insertUserCredential(UserCredential userCredential) {
        em.persist(userCredential);
        return userCredential;
    }

}
