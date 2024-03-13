package br.edu.ifsp.EduardoDuarteDerisso.modelo;

import br.edu.ifsp.EduardoDuarteDerisso.util.StatuAluno;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String ra;
    private String email;
    private BigDecimal nota1;
    private BigDecimal nota2;
    private BigDecimal nota3;

    public Aluno() {}

    public Aluno(String nome, String ra, String email, BigDecimal nota1, BigDecimal nota2, BigDecimal nota3) {
        this.nome = nome;
        this.ra = ra;
        this.email = email;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public BigDecimal getNota3() {
        return nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getNota1() {
        return nota1;
    }

    public void setNota1(BigDecimal nota1) {
        this.nota1 = nota1;
    }

    public BigDecimal getNota2() {
        return nota2;
    }

    public void setNota2(BigDecimal nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(BigDecimal nota3) {
        this.nota3 = nota3;
    }
    public BigDecimal setMedia(BigDecimal nota1, BigDecimal nota2,BigDecimal nota3) {
        BigDecimal soma = nota1.add(nota2).add(nota3);
        BigDecimal quantidade = new BigDecimal("3");
        BigDecimal media = soma.divide(quantidade);
        return media;
    }
    public StatuAluno setStatus(BigDecimal media) {
        BigDecimal notaMinAprovado = new BigDecimal(6);
        BigDecimal notaMinRecuperacao = new BigDecimal(4);

        if (media.compareTo(notaMinAprovado) >= 0) return StatuAluno.APROVADOR;
        if (media.compareTo(notaMinRecuperacao) >= 0) return StatuAluno.RECUPERACAO;
        return StatuAluno.REPROVADO;
    }

    @Override
    public String toString() {
        return  "Nome: '" + nome + '\n' +
                ", RA: '" + ra + '\n' +
                ", Email: '" + email + '\n' +
                ", Notas: " + nota1 + " | " + nota2 + " | " + nota3 ;
    }
}
