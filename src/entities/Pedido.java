package entities;

import java.util.List;

public class Pedido {
    private List<Refeicao> itens;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    private double valorTotal;

    public boolean continuarPedido(String continuacao) {
        return continuacao.equalsIgnoreCase("S");
    }

    public double calculaValorTotal(List<Refeicao> itens) {
        double valorTotal = 0;

        for (int i = 0; i < itens.size(); i++) {
            valorTotal += itens.get(i).getPreco();
        }

        return valorTotal;
    }
}
