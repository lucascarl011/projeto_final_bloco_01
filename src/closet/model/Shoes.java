package closet.model;

public abstract class Shoes {

    // Atributos Classe Shoes
    private int numero;
    private String nome;
    private double preco;
    private String descricao;
    private int estoque;
    private int tipo;

    // Construtor
    public Shoes(int numero, String nome, double preco, String descricao, int estoque, int tipo) {
        this.numero = numero;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.tipo = tipo;
    }

    // Get e Set
    public int getNumero() {
        return numero;
    }

    public void setNumero() {
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
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
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Estoque: " + this.estoque);
        System.out.println("Tipo: " + tipo);
    }
}

