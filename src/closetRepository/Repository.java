package closetRepository;

import closetModel.Shoes;
public interface Repository {

    // CRUD do Shoes
    public void procurarPorNumero(int numero);
    public void listarTodas();

    public void cadastrar(Shoes shoes);
    public void atualizar(Shoes shoes);
    public void deletar(int numero);



}
