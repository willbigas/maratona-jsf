package br.com.willbigas.maratonajsf.bean.estudante;

import br.com.willbigas.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Devdojo", "eh", "foda"};
    private List<String> nomesList = Arrays.asList("Devdojo", "eh", "foda", "pra", "krl");
    private Boolean mostrarNotas;


    public void executar() {
        System.out.println("Fazendo uma Busca no BD!!!");
        System.out.println("Processando!!!");
        System.out.println("Exibindo");
    }

    public void executar(String parametro) {
        System.out.println("Fazendo uma Busca com o parametros!!!" + parametro);
        System.out.println("Fazendo uma Busca no BD!!!");
        System.out.println("Processando!!!");
        System.out.println("Exibindo");
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public String executarRetorno(String parametro) {
        return "quem é o lindão ?" + parametro;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Boolean getMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(Boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }
}
