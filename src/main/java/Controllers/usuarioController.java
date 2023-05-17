package Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // manejan las URL
public class usuarioController {
	
	@RequestMapping(value ="prueba")
	public String prueba(){
		
		return "Hello";
		
	}
	

}
