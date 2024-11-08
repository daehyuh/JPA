package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
    EntityManager em = emf.createEntityManager();
    EntityTransaction ts = em.getTransaction();
    ts.begin();



    ts.commit();
    emf.close();
    em.close();
    }
}
