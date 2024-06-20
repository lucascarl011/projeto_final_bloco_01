package closetModel;

public class SapatoSocial extends Shoes {
    private String modeloSocial;

    public SapatoSocial(int numero, String cliente, String marca, double preco, int tipo, String modeloSocial) {
        super(numero, cliente, marca, preco, tipo);
        this.modeloSocial = modeloSocial;
    }

    public String getModeloSocial() {
        return modeloSocial;
    }

    public void setModeloSocial(String modeloSocial) {
        this.modeloSocial = modeloSocial;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Modelo " + this.modeloSocial);
    }
}
