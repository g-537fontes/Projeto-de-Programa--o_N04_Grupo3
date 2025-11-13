package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Mapeia a URL raiz (localhost:8080) para a página index.html
    @GetMapping("/")
    public String index() {
        return "index"; // Retorna o nome do arquivo index.html
    }
}
