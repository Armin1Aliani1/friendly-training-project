package com.newProject.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

    public HibernateUtil() {
    }

    public static EntityManagerFactory getEmf() {
        return emf;
    }
}
