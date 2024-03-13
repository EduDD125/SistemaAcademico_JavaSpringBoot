package br.edu.ifsp.EduardoDuarteDerisso;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    public static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("escola");
    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
