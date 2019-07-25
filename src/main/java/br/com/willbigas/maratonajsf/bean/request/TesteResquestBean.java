package br.com.willbigas.maratonajsf.bean.request;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Named
@RequestScoped
public class TesteResquestBean implements Serializable {
    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

      @PostConstruct
    public void init() {
        System.out.println("Entrou no Post construct do Request Scoped");
        personagens = Arrays.asList("Yusuke" , "Hiei" , "Kurama");
    }

    public void selecionarPersonagem() {
     int index =  ThreadLocalRandom.current().nextInt(3);
     String personagem = personagens.get(index);
     personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}
