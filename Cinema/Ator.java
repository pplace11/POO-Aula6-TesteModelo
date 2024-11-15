package Teste.Cinema;

public class Ator {
    private String nomeAtor;
    private String nacionalidade;
    
    public Ator(String	nomeAtor, String nacionalidade){
        this.nomeAtor = nomeAtor;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }
    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
