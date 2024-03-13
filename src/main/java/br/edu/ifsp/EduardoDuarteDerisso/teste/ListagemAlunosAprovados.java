package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.JPAUtil;
import br.edu.ifsp.EduardoDuarteDerisso.dao.AlunoDao;
import jakarta.persistence.EntityManager;

public class ListagemAlunosAprovados {
    public void ListarAlunosAprovados() {
        EntityManager em = JPAUtil.getEntityManager();
        AlunoDao dao = new AlunoDao(em);

        em.getTransaction().begin();

        dao.listarAprovados();

        em.getTransaction().commit();
        em.close();
    }
}
