package me.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//editor de JSON on line "https://jsoneditoronline.org/"
//chatGPT para gerar os diagramas de classes UML "chat.openai.com"
//o código mermaid fornecido pelo chat pode ser usado como gráfico no github utilizando '''...'''
//pode ser consultado o site "mermaid.js.org" para conhecer mais
//o deploy será realizado no https://railway.app pela conta do github.
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
