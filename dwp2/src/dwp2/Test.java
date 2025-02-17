package dwp2;

//Ejemplo 1

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
//Establece la ruta del servicio: URL base + /hola
@Path("/hola")
public class Test{
	// Se ejecuta este m�todo si se pide TEXT_PLAIN 
	@GET 
	@Produces (MediaType.TEXT_PLAIN)
	public String textHola() {
		return "Hola Rest texto";
	}
// Se ejecuta este m�todo si se pide TEXT_XML 
@GET
@Produces (MediaType.TEXT_XML)
	public String xmlHola() {
		return"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><hello>Hola Rest</hello>";
	}
// Se ejecuta este m�todo si se pide TEXT_HTML 
@GET
@Produces(MediaType.TEXT_HTML)
	public String htmlHola() {
		return "<html><title>Hola Rest</title><body><h1>Hola Rest</body></h1></html>";
	}
}
