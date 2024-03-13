package br.edu.ifsp.EduardoDuarteDerisso;

import br.edu.ifsp.EduardoDuarteDerisso.modelo.Aluno;
import br.edu.ifsp.EduardoDuarteDerisso.teste.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.Scanner;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        
        SpringApplication.run(Main.class, args);
        
        int op = 0;
        do{
            System.out.println("********  Menu *******");
            System.out.println("\n");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Excluir aluno");
            System.out.println("3 - Alterar aluno");
            System.out.println("4 - Buscar aluno");
            System.out.println("5 - Listar alunos aprovados");
            System.out.println("6 - FIM");

            Scanner sc = new Scanner(System.in);

            op = sc.nextInt();
            
            if (op == 1) {

                System.out.println("******** Cadastro de Aluno *********");

                System.out.println("digite o nome: ");
                String lixo = sc.nextLine();
                String nome = sc.nextLine();

                System.out.println("Digite o RA:");
                String ra = sc.nextLine();

                System.out.println("Digite o e-mail:");
                String email = sc.nextLine();

                System.out.println("Digite a nota 1:");
                BigDecimal nota1 = new BigDecimal(sc.nextFloat());

                System.out.println("Digite a nota 2:");
                BigDecimal nota2 = new BigDecimal(sc.nextFloat());


                System.out.println("Digite a nota 3");
                BigDecimal nota3 = new BigDecimal(sc.nextFloat());

                CadastroDaAluno operacao = new CadastroDaAluno();
                operacao.CadastrarAluno(nome, ra, email, nota1, nota2, nota3);
            };
            if (op == 2) {
                System.out.println("******** Deletação de Aluno *********");

                System.out.println("digite o nome");
                String lixo = sc.nextLine();
                String nome = sc.nextLine();

                DelecaoDeAluno operacao = new DelecaoDeAluno();
                operacao.DeletarAluno(nome);
            }
            if (op == 3) {
                System.out.println("******** Alteração de Aluno por nome *********");
                System.out.println("\n");

                System.out.println("digite o nome");
                String lixo = sc.nextLine();
                String nome = sc.nextLine();

                AlteracaoDeAluno operacao = new AlteracaoDeAluno();
                operacao.AlterarAluno(nome);
            }
            if (op == 4) {
                System.out.println("******** Burca de Aluno por nome *********");
                System.out.println("\n");

                System.out.println("digite o nome");
                String lixo = sc.nextLine();
                String nome = sc.nextLine();

                BuscaDeAluno operacao = new BuscaDeAluno();
                operacao.BuscarAluno(nome);
            }
            if (op == 5) {
                String lixo = sc.nextLine();

                System.out.println("*******  Listagem de alunos aprovados  *******");
                System.out.println("\n");

                ListagemAlunosAprovados operacao = new ListagemAlunosAprovados();
                operacao.ListarAlunosAprovados();
            }

        }
        while(op!=6);
        System.out.println("Fim!");
    }

}
