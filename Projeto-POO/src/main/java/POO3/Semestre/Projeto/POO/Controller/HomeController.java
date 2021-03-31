package POO3.Semestre.Projeto.POO.Controller;

 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.GetMapping;
 
 @Controller
public class HomeController {

	 @GetMapping("/")
	 public String paginaInicial () {
		 return"index";
	 }
	 
}
