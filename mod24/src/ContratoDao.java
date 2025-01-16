public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }

    @Override
    public String buscar(int id) {
        throw new UnsupportedOperationException("Não implementado no banco");
    }

    @Override
    public String atualizar(int id) {
        throw new UnsupportedOperationException("Não implementado no banco");
    }

    @Override
    public String excluir(int id) {
        throw new UnsupportedOperationException("Não implementado no banco");
    }
}
