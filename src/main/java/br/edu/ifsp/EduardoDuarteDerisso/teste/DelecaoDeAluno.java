package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.JPAUtil;
import br.edu.ifsp.EduardoDuarteDerisso.dao.AlunoDao;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import jakarta.persistence.EntityManager;

public class DelecaoDeAluno {
    public void DeletarAluno(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        AlunoDao dao = new AlunoDao(em);

        em.getTransaction().begin();

        Aluno aluno = dao.buscar(nome);
        if (aluno != null) dao.deletar(aluno);
        else{ System.out.println("Aluno não encontrado\n");}

        em.getTransaction().commit();
        em.close();
    }
}
