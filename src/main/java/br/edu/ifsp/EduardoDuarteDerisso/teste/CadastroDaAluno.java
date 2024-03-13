package br.edu.ifsp.EduardoDuarteDerisso.teste;
import br.edu.ifsp.EduardoDuarteDerisso.JPAUtil;
import br.edu.ifsp.EduardoDuarteDerisso.dao.AlunoDao;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import br.edu.ifsp.EduardoDuarteDerisso.util.StatuAluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;


public class CadastroDaAluno {
    public void CadastrarAluno(String nome,String ra,String email,BigDecimal nota1,BigDecimal nota2,BigDecimal nota3) {
        Aluno a1 = new Aluno( nome,ra,email,nota1,nota2,nota3);

        EntityManager em = JPAUtil.getEntityManager();
        AlunoDao dao = new AlunoDao(em);

        em.getTransaction().begin();

        dao.cadastrar(a1);

        em.getTransaction().commit();
        em.close();
    }
}
