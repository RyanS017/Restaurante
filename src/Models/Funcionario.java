package Models;

public abstract class Funcionario {
    private String nome;
    private int indentificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIndentificador() {
        return indentificador;
    }

    public void setIndentificador(int indentificador) {
        this.indentificador = indentificador;
    }

    public Funcionario(String nome, int indentificador) {
        this.nome = nome;
        this.indentificador = indentificador;
    }



    //public abstract void realizaTrabalho();
}
