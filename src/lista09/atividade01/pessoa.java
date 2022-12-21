package lista09.atividade01;

public class pessoa {

    private String nome;
    private String telefone;
    private String data_de_admicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getData_de_admicao() {
        return data_de_admicao;
    }

    public void setData_de_admicao(String data_de_admicao) {
        this.data_de_admicao = data_de_admicao;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "Nome: '" + nome + '\'' +
                ", Telefone: '" + telefone + '\'' +
                ", Data de Admição: '" + data_de_admicao + '\'' +
                '}';
    }
}
