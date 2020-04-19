package com.kalpana.atyourdoorstep.dao;

import com.kalpana.atyourdoorstep.entity.UserDetails;
import javax.persistence.EntityManager;

public class UserDao {

    private final EntityManager em;

    public UserDao(EntityManager em) {
        this.em = em;
    }

    public UserDetails insertUserDetails(UserDetails details) {
        em.persist(details);
        return details;
    }

    public UserDetails findUserDetailsById(Long userId) {
        return em.find(UserDetails.class, userId);
    }

    public UserDetails loadUser(Long userId) {
        return em.getReference(UserDetails.class, userId);
    }

}
