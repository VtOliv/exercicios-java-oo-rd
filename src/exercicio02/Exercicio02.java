package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio02 {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new AuxiliarEscritorio( 2500.0,"Nery Pumpido", 500.0));
        funcionarios.add(new AuxiliarEscritorio( 2300.0,"Sergio Batista", 500.0));
        funcionarios.add(new AuxiliarEscritorio( 2000.0,"José Brown", 500.0));
        funcionarios.add(new AuxiliarEscritorio( 2000.0,"José Burruchaga", 500.0));
        funcionarios.add(new TecnicoManutencao( 3500.0,"José Cuciuffo", 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao( 3300.0,"Diego Maradona", 10.0, 500.0));
        funcionarios.add(new TecnicoManutencao(3300.0,"Jorge Valdano",  10.0, 500.0));
        funcionarios.add(new TecnicoManutencao(3000.0,"Hector Enrique",  10.0, 500.0));
        funcionarios.add(new TecnicoManutencao(3000.0,"Ricardo Giusti",  10.0, 500.0));
        funcionarios.add(new TecnicoManutencao(3000.0,"Julio Olarticoechea",  10.0, 500.0));
        funcionarios.add(new TecnicoManutencao(3000.0, "Oscar Ruggeri", 10.0, 500.0));
        funcionarios.add(new Gerente(5000.0,"Carlos Bilardo",  150.0));

        System.out.println("O valor do orçamento anual do departamento 1986 da empresa é: "+calculaOrcamentoAnual(funcionarios));

    }

    private static double calculaOrcamentoAnual(List<Funcionario> funcionarios) {
        double soma;
        for (int i = 0; i < funcionarios.size(); i++) {
            soma = 
        }
        return soma;
    }
}
