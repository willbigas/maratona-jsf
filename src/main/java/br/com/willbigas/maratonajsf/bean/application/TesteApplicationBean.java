package br.com.willbigas.maratonajsf.bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@Named
@ApplicationScoped
public class TesteApplicationBean  implements Serializable {
    private List<String> categoriaList;

    @PostConstruct
    public void init() {
        System.out.println("Entrou no Post Construct do Application Scoped");
        categoriaList = Arrays.asList("RPG" , "SYFY", "TERROR");
    }

    public void mudarLista() {
        categoriaList = Arrays.asList("RPG" , "SYFY", "TERROR" ,"PORN");
    }


    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
