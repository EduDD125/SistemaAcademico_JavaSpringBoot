package br.edu.ifsp.EduardoDuarteDerisso.dao;

import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import jakarta.persistence.EntityManager;

import java.util.List;

public class AlunoDao {
    private EntityManager em;

    public AlunoDao(EntityManager em) {
        this.em = em;
    }
    public void cadastrar(Aluno aluno) {
        this.em.persist(aluno);
    }
    public Aluno buscar(String nome) {
        return em.createQuery("Select a From Aluno a Where a.nome = :nome", Aluno.class)
                .setParameter("nome", nome)
                .getSingleResult();
    }
    public void deletar( Aluno aluno) {em.remove(aluno);}
    public void alterar(Aluno aluno) {
        em.merge(aluno);
    }
    public List listarAprovados() {
        return em.createQuery("Select a From Aluno a Where ").getResultList();
    }
}
