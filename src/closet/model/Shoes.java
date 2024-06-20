package closet.model;

public abstract class Shoes {

    // Atributos Classe Shoes
    private int numero;
    private String nome;
    private double preco;
    private int tipo;

    // Construtor
    public Shoes(int numero, String nome, float preco, int tipo) {
        this.numero = numero;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tipo: " + tipo);
    }
}

