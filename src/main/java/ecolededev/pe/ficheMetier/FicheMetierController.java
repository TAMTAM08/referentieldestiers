package ecolededev.pe.ficheMetier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by grenouille on 20/06/2017.
 */
@Controller
public class FicheMetierController
{
        @GetMapping("/afficheFicheMetier")
       	String afficheFicheMetier(Model model) {
       		return "ficheMetier/ficheMetier";
       	}

}
