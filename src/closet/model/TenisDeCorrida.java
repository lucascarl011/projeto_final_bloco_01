package closet.model;

public class TenisDeCorrida extends Shoes {
    private String modeloCorrida;

    public TenisDeCorrida(int numero, String nome, float preco, int tipo, String modeloCorrida) {
        super(numero, nome, preco, tipo);
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
