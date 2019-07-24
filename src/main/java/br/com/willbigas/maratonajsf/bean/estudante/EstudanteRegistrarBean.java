package br.com.willbigas.maratonajsf.bean.estudante;

import br.com.willbigas.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Named
public class EstudanteRegistrarBean implements Serializable {

    private Estudante estudante = new Estudante();
    private String[] nomesArray = {"Devdojo" , "eh" , "foda"};
    private List<String> nomesList = Arrays.asList("Devdojo" , "eh" , "foda", "pra" ,"krl");

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
}
