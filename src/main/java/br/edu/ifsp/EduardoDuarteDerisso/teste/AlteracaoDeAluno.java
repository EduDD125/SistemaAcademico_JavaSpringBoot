package br.edu.ifsp.EduardoDuarteDerisso.teste;

import br.edu.ifsp.EduardoDuarteDerisso.JPAUtil;
import br.edu.ifsp.EduardoDuarteDerisso.dao.AlunoDao;
import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import jakarta.persistence.EntityManager;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class AlteracaoDeAluno {
    public void AlterarAluno(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        AlunoDao dao = new AlunoDao(em);

        em.getTransaction().begin();

        Aluno aluno = dao.buscar(nome);
        if (aluno != null) {
            System.out.println("\nAluno encontrado:\n");
            System.out.println(aluno.toString());

            Scanner sc = new Scanner(System.in);

            System.out.println("\nDigite o novo nome: ");
            String novoNome = sc.nextLine();
            aluno.setNome(novoNome);

            System.out.println("\nDigite o novo ra: ");
            String novoRa = sc.nextLine();
            aluno.setRa(novoRa);

            System.out.println("\nDigite o novo email: ");
            String novoEmail = sc.nextLine();
            aluno.setEmail(novoEmail);

            System.out.println("\nDigite o nova nota1: ");
            BigDecimal novaNota1 = sc.nextBigDecimal();
            aluno.setNota1(novaNota1);

            System.out.println("\nDigite o nova nota2: ");
            BigDecimal novaNota2 = sc.nextBigDecimal();
            aluno.setNota1(novaNota2);

            System.out.println("\nDigite o nova nota3: ");
            BigDecimal novaNota3 = sc.nextBigDecimal();
            aluno.setNota1(novaNota3);

            dao.alterar(aluno);
        } else{
            System.out.println("\nNenhum aluno foi encontrado");
        }

        em.getTransaction().commit();
        em.close();
    }
}
