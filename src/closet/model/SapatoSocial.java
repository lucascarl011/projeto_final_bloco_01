package closet.model;

public class SapatoSocial extends Shoes {
    private String modeloSocial;

    public SapatoSocial(int numero, String nome, double preco, int tipo, String modeloSocial) {
        super(numero, nome, preco, tipo);
        this.modeloSocial = modeloSocial;
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
