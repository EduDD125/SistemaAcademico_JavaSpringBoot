package br.edu.ifsp.EduardoDuarteDerisso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class CadastroDaAluno {
    public static void main(String[] args) {

        SpringApplication.run(CadastroDaAluno.class, args);

        Aluno a1 = new Aluno( "Ana Silva", "123456", "ana.silva@email.com", new BigDecimal(9.5), new BigDecimal(8.0), new BigDecimal(7.5));
        Aluno a2 = new Aluno("João Oliveira", "654321", "joao.oliveira@email.com", new BigDecimal(10.0), new BigDecimal(9.0), new BigDecimal(8.5));
        Aluno a3 = new Aluno("Maria Souza", "987654", "maria.souza@email.com", new BigDecimal(8.0), new BigDecimal(7.0), new BigDecimal(6.5));
        Aluno a4 = new Aluno("Pedro Santos", "321654", "pedro.santos@email.com", new BigDecimal(7.5), new BigDecimal(6.5), new BigDecimal(5.5));
        Aluno a5 = new Aluno("Camila Costa", "456321", "camila.costa@email.com", new BigDecimal(9.0), new BigDecimal(8.5), new BigDecimal(8.0));
        Aluno a6 = new Aluno("Bruno Ferreira", "789456", "bruno.ferreira@email.com", new BigDecimal(10.0), new BigDecimal(9.5), new BigDecimal(9.0));
        Aluno a7 = new Aluno("Fernanda Rodrigues", "123789", "fernanda.rodrigues@email.com", new BigDecimal(8.5), new BigDecimal(7.5), new BigDecimal(7.0));
        Aluno a8 = new Aluno("Eduardo Pereira", "456123", "eduardo.pereira@email.com", new BigDecimal(7.0), new BigDecimal(6.0), new BigDecimal(5.0));
        Aluno a9 = new Aluno("Gabriela Martins", "789012", "gabriela.martins@email.com", new BigDecimal(9.5), new BigDecimal(9.0), new BigDecimal(8.5));
        Aluno a10 = new Aluno("Leonardo Silva", "1234567", "leonardo.silva@email.com", new BigDecimal(10.0), new BigDecimal(10.0), new BigDecimal(10.0));

        EntityManagerFactory Factory = Persistence.createEntityManagerFactory("escola");
        EntityManager em = Factory.createEntityManager();

        em.getTransaction().begin();

        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(a4);
        em.persist(a5);
        em.persist(a6);
        em.persist(a7);
        em.persist(a8);
        em.persist(a9);
        em.persist(a10);

        em.getTransaction().commit();
        em.close();
    }
}
