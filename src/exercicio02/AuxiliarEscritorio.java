package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    private double bonus;

    public AuxiliarEscritorio(double salario, String nome, double bonus) {
        super(salario, nome);
        this.bonus = bonus;
    }


    @Override
    public void salarioAnual() {
        super.salarioAnual();
        double salarioAux;
        salarioAux = getSalario() + this.bonus;
    }

    // TODO: implemente o código desta classe

}
