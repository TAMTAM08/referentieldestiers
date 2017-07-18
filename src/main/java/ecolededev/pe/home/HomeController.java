package ecolededev.pe.home;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import ecolededev.pe.services.IPartenaireServices;
import ecolededev.pe.services.IConventionServices;

import ecolededev.pe.services.IContactServices;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
class HomeController {

	@Autowired
	private IPartenaireServices partenaireServices;
	@Autowired
	private IConventionServices conventionServices;
	@Autowired
	private IContactServices contactServices;


	@ModelAttribute("module")
	String module() {
		return "home";
	} // module()

	@GetMapping("/")
	String index(Principal principal, Model model) {
		if (principal == null) {
			return "home/homeNotSignedIn";
		} else {
			HomeForm homeForm = (HomeForm) model.asMap().get("homeForm");
			if (homeForm == null) {
				homeForm = new HomeForm();
				model.addAttribute(homeForm);
				homeForm.setListePartenaires(partenaireServices.listePartenaire());
				homeForm.setListeConventions(conventionServices.listeConvention());		
				homeForm.setListeContacts(contactServices.listeContacts());
			} // if
			return "home/homeSignedIn";
		} // if
	} // index ()
} // HomeController
