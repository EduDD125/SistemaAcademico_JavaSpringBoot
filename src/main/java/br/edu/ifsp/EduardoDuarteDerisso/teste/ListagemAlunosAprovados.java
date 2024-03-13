package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.JPAUtil;
import br.edu.ifsp.EduardoDuarteDerisso.dao.AlunoDao;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import jakarta.persistence.EntityManager;

import java.util.List;

public class ListagemAlunosAprovados {
    public void ListarAlunosAprovados() {
        EntityManager em = JPAUtil.getEntityManager();
        AlunoDao dao = new AlunoDao(em);

        em.getTransaction().begin();

        List<Aluno> lista = dao.listarAprovados();
        if (!lista.isEmpty()) {
            for (Aluno aluno : lista) {
                System.out.println(aluno.toString());
            }
        }

        em.getTransaction().commit();
        em.close();
    }
}
