public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(int id) {
        return contratoDao.buscar(id);
    }

    @Override
    public String atualizar(int id) {
        return contratoDao.atualizar(id);
    }

    @Override
    public String excluir(int id) {
        return contratoDao.excluir(id);
    }
}
