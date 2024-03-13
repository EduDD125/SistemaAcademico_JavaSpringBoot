package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.JPAUtil;
import br.edu.ifsp.EduardoDuarteDerisso.dao.AlunoDao;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import jakarta.persistence.EntityManager;

public class BuscaDeAluno {
    public void BuscarAluno(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        AlunoDao dao = new AlunoDao(em);

        em.getTransaction().begin();

        Aluno aluno = dao.buscar(nome);
        if (aluno != null) {
            System.out.println("\n");
            System.out.println("Aluno encontrado:");
            System.out.println(aluno.toString());
        } else { System.out.println("\nAluno não encontrado\n"); }

        em.getTransaction().commit();
        em.close();
    }
}
