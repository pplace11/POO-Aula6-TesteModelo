package Teste.Cinema;

import java.util.ArrayList;

public class Filme {
    private String tituloFilme;
    private int anoLancamento;
    private ArrayList<Ator>atores;

    public Filme(String titiloFilme, int anoLancamento){
        this.tituloFilme = titiloFilme;
        this.anoLancamento = anoLancamento;
        this.atores = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator){
        atores.add(ator);
    }

    public void listarAtores(){
        System.out.println("Atores do filme " + tituloFilme + ":");
        for(Ator ator:atores){
            System.out.println(ator.getNomeAtor());
        }
    }
    
    public void removerAtor(String nomeAtor){
        atores.removeIf(ator->ator.getNomeAtor().equalsIgnoreCase(nomeAtor));
    }

    public boolean encontrarAtor(String nomeAtor){
        for(Ator ator:atores){
            if(ator.getNomeAtor().equalsIgnoreCase(nomeAtor)){
                return true;
            }
        }
        return false;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }
    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public ArrayList<Ator> getAtores() {
        return atores;
    }
    public void setAtores(ArrayList<Ator> atores) {
        this.atores = atores;
    }
}
