package closetModel;

public class TenisDeCorrida extends Shoes {
    private String modeloCorrida;

    public TenisDeCorrida(int numero, String cliente, String marca, double preco, int tipo, String modeloCorrida) {
        super(numero, cliente, marca, preco, tipo);
        this.modeloCorrida = modeloCorrida;
    }

    public String getModeloCorrida() {
        return modeloCorrida;
    }

    public void setModeloCorrida(String modeloCorrida) {
        this.modeloCorrida = modeloCorrida;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Modelo: " + this.modeloCorrida);
    }
}
