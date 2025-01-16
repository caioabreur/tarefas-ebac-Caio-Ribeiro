public class ContratoDaoMock implements IContratoDao {

    @Override
    public void salvar() {
        // Simula o salvamento
    }

    @Override
    public String buscar(int id) {
        return "Contrato encontrado";
    }

    @Override
    public String atualizar(int id) {
        return "Atualizado com sucesso";
    }

    @Override
    public String excluir(int id) {
        return "Excluído com sucesso";
    }
}
