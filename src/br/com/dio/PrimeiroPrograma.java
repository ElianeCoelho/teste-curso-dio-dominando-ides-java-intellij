package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livro livro1 = new Livro("O problema dos 3 corpos", 230);
        System.out.println(livro1);
        System.out.println(gato);
/*
        //sout// inserir o println
*/
        //int a = 5;
        // int b = 3;
        // System.out.println("Hello World!!! " + (a+b));
        // Ctrl + Shift + F10 pra rodar o programa */
    }
}
class Livro {
        private String nome;
        private Integer numeroPaginas;

    public Livro(String nome, Integer numeroPaginas) {
        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}


