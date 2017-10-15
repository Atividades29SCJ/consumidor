package br.com.fiap.consumidor.load;

import javax.xml.ws.Endpoint;

import br.com.fiap.consumidor.service.ConsumidorService;

public class Loader {

	public static void main(String[] args) {
		
		String port = System.getenv("PORT"); 
//		String port = "8080";
        String host = "http://0.0.0.0:";
        String uri = "/service";
        ConsumidorService service = new ConsumidorService();
        Endpoint.publish(host + port + uri, service);
	}
}
