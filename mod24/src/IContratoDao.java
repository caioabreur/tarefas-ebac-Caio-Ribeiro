public interface IContratoDao {
    void salvar();
    String buscar(int id);
    String atualizar(int id);
    String excluir(int id);
}