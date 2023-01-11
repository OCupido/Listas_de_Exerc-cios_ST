package lista11.exemplo_interfaces;
//DAO = Data Access Object -> banco de dados (persistência)
// CRUD -> Create, Rename, Update, Delete
public interface interfaceDAO {

    public void salvar (String nome);
    public void criar (String id);
    public void deletar (int id);
    public void atualizar (int id);


}
