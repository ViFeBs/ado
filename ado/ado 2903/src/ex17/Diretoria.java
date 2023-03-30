package ex17;

import java.util.ArrayList;
import java.util.List;

public class Diretoria implements DepartamentoComponent {
    private List<DepartamentoComponent> lista;
    private String nome;

    
    public Diretoria(String nome) {
        this.lista = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionar(DepartamentoComponent component) {
        lista.add(component);
    }

    public void remover(DepartamentoComponent component) {
        lista.add(component);
    }

    public void getChild(int i) {
        lista.get(i);
    }
    @Override
    public double getCusto() {
        double total = 0;
        for(DepartamentoComponent c : lista){
            total += c.getCusto();
        }
        return total;
    }
    @Override
    public int getFuncionario() {
        int total = 0;
        for(DepartamentoComponent c : lista){
            total += c.getFuncionario();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Diretoria{" + "lista=" + lista + ", nome=" + nome + '}';
    }

    
}
