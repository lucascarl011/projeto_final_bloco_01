package closet.model;

public class TenisDeCorrida extends Shoes {
    private String modeloCorrida;

    public TenisDeCorrida(int numero, String nome, double preco, String descricao, int estoque, String modelo, int tipo) {
        super(numero, nome, preco, descricao, estoque, tipo);
        this.modeloCorrida = modelo;
    }

    public String getModelo() {
        return modeloCorrida;
    }

    public void setModelo(String modelo) {
        this.modeloCorrida = modelo;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Modelo: " + this.modeloCorrida);
    }
}
