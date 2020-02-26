package exercicio02;

public abstract class Funcionario {

    private String nome;
    private double salario;
    private double bonus;

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void salarioAnual () {
        salario = salario * 13;
    }
}
