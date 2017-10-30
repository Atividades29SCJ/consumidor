package br.com.fiap.consumidor.load;

import javax.xml.ws.Endpoint;

import br.com.fiap.consumidor.service.ConsumidorService;

public class Loader {

	public static void main(String[] args) {
		
		String port = System.getenv("PORT"); 
        String host = "http://0.0.0.0:";
        String uri = "/service";
        ConsumidorService service = new ConsumidorService();
        
//        host + port + uri
        
        Endpoint.publish("http://localhost:8080/service", service);
	}
}
