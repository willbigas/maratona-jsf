package br.com.willbigas.maratonajsf.comunicacao;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {

    public void imprimirAtributos() {
       String initParameter = FacesContext.getCurrentInstance()
                .getExternalContext()
                .getInitParameter("images.location");
        System.out.println(initParameter);
    }
}
