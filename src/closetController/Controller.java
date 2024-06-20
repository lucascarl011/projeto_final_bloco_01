package closetController;

import closetModel.Shoes;
import closetRepository.Repository;

import java.util.ArrayList;

public class Controller implements Repository {

    // Collection listaShoes
    private ArrayList<Shoes> listaShoes = new ArrayList<Shoes>();
    int numero = 0;

    // Procurar Tênis por número
    @Override
    public void procurarPorNumero(int numero) {
        var shoes = buscarNaCollection(numero);

        if (shoes != null) {
            shoes.visualizar();
        }else {
            System.out.println("\nO Tênis número: " + numero + " não foi encontrado!");
        }
    }

    @Override
    public void listarTodas() {
        for (var shoes : listaShoes) {
            shoes.visualizar();
        }
    }

    @Override
    public void cadastrar(Shoes shoes) {
        listaShoes.add(shoes);

    }

    @Override
    public void atualizar(Shoes shoes) {
        Shoes buscaShoes = buscarNaCollection(shoes.getNumero());

        if (buscaShoes != null) {
            listaShoes.set(listaShoes.indexOf(buscaShoes), shoes);
            System.out.println("\nO produto número: " + shoes.getNumero() + " foi atualizado com sucesso!");
        } else {
            System.out.println("\nO produto número: " + shoes.getNumero() + " não foi encontrado!");
        }
    }

    @Override
    public void deletar(int numero) {
        var shoes = buscarNaCollection(numero);

        if (shoes != null) {
            if (listaShoes.remove(shoes) == true) {
                System.out.println("\nO Tênis número: " + numero + " foi deletado com sucesso!");
            }else {
                System.out.println("\nO Tênis número: " + numero + " não foi encontrado");
            }
        }
    }

    public int gerarNumero() {
        return ++ numero;
    }

    public Shoes buscarNaCollection(int numero) {
        for (var shoes : listaShoes) {
            if (shoes.getNumero() == numero) {
                return shoes;
            }
        }
        return null;
    }

}
