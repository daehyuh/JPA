package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();

    Member member = new Member();
    member.setId(1L);
    member.setName("HelloA");
    entityManager.persist(member);

    transaction.commit();
    entityManagerFactory.close();
    entityManager.close();
    }
}
