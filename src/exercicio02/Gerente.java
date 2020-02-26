package exercicio02;

public class Gerente extends Funcionario {

private double bonus;

    public Gerente(double salario, String nome, double bonus) {
        super(salario, nome);
        this.bonus = bonus;
    }

    public void calcularBonus(double porcentagem) {
       this.bonus = getSalario() / porcentagem ;
    }

    @Override
    public void salarioAnual() {
        super.salarioAnual();
        double salarioGer;
        salarioGer = getSalario() + this.bonus;
    }
}
