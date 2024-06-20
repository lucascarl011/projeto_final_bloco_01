package closetModel;

public abstract class Shoes {

    // Atributos Classe Shoes
    private int numero;
    private String cliente;
    private String marca;
    private double preco;
    private int tipo;

    // Construtor


    public Shoes(int numero, String cliente, String marca, double preco, int tipo) {
        this.numero = numero;
        this.cliente = cliente;
        this.marca = marca;
        this.preco = preco;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nome) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    // Métodos
    public void visualizar() {
        String tipo = "";

        switch (this.tipo) {
            case 1:
                tipo = "Tenis de Corrida";
                break;
            case 2:
                tipo = "Sapato Social";
                break;
        }

        System.out.println("Detalhes do Tênis: ");
        System.out.println("Número de Série: " + this.numero);
        System.out.println("Nome: " + this.cliente);
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tipo: " + tipo);
    }
}

