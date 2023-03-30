package ex17;

import java.util.ArrayList;


public class Departamento implements DepartamentoComponent {

    private ArrayList<Funcionario> funcionario;
    private double custo;

    public Departamento(ArrayList<Funcionario> funcionario, double custo) {
        this.funcionario =funcionario;
        this.custo = custo;
    }
    @Override
    public double getCusto() {
        return custo;
    }
    @Override
    public int getFuncionario() {
        return funcionario.size();
    }

    


    
}
