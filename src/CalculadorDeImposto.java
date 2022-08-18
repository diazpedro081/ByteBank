public class CalculadorDeImposto {
    
    private double totalImposto;

    public void registra(Tributavel t) {
        double valor = t.getValorimposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

}
