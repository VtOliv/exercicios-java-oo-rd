package exercicio02;

public class TecnicoManutencao extends Funcionario{

    private double insalubridade;
    private double bonus;

    public TecnicoManutencao(double salario, String nome, double insalubridade, double bonus) {
        super(salario, nome);
        this.insalubridade = insalubridade;
        this.bonus = bonus;
    }

    public void calculoInsalubre (double porcentagem) {
        double taxa;
        this.insalubridade = getSalario() / porcentagem;
        setSalario(getSalario() + this.insalubridade);
    }

    @Override
    public void salarioAnual() {
        super.salarioAnual();
        double salarioTec;
        salarioTec = getSalario() + this.bonus + this.insalubridade;
    }

    // TODO: implemente o código desta classe

}
