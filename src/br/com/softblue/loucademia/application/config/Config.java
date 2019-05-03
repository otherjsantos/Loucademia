package br.com.softblue.loucademia.application.config;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import javax.faces.annotation.FacesConfig.Version;

@FacesConfig(version = Version.JSF_2_3) //Informando que o projeto usará JSF 2.3
@ApplicationScoped //Aplicando a configuração ao escopo da aplicação
public class Config {

}
