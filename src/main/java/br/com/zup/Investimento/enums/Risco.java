package br.com.zup.Investimento.enums;

public enum Risco {
    BAIXO(0.005),
    MEDIO(0.015),
    ALTO(0.025);

    private double taxa;

    Risco(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}
