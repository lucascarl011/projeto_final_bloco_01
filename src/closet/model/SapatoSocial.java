package closet.model;

public class SapatoSocial extends Shoes {
    private String modeloSocial;

    public SapatoSocial(int numero, String nome, double preco, String descricao, int estoque, String modelo, int tipo) {
        super(numero, nome, preco, descricao, estoque, tipo);
        this.modeloSocial = modelo;
    }

    public String getModelo() {
        return modeloSocial;
    }

    public void setModelo(String modelo) {
        this.modeloSocial = modelo;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Modelo " + this.modeloSocial);
    }
}
