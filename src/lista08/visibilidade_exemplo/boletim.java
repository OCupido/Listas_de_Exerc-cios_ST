package lista08.visibilidade_exemplo;
//daods a serem armazenado do aluno: nome, disciplina, notas e média.
public class boletim {
    //aplicação do ENCAPSULAMENTO = alterar a visibilidade
    //dos atributos para proteção;
    private String nome;
    private String disciplina;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double media;

    //construção dos metodos acessores - acessar os atributos
    //SET - método que permite alterar o valor do atributo
    //GET - método que permite permite acessar, Visualizar o valor do atributo


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setDisciplina (String disc){
        this.disciplina = disc;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setNota1 (double nota1){
        this.nota1 = nota1;
    }

    public double getNota1() {
        return this.nota1;
    }

    public void setNota2 (double nota2){
        this.nota2 = nota2;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    //metodo pra calcular a media do aluno
    //esse metodo não tem retorno, pois é do tipo void
    public void calcularMedia (){
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Média do aluno: " + media);
    }
    // esse metodo tem retorno, pois tem um tipo.
    public double calcularMedia2(){
        media = (nota1+nota2+nota3+nota4)/4;
        return media;
    }
}
