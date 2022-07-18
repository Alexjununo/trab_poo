package Controle;

import Entidades.Tributavel;

public class GerenciadorIRPF {
    private double total;

    void adiciona(Tributavel t) {
        this.total += t.calculaTributos();
    }

    public double getTotal() {
        return this.total;
    }
}