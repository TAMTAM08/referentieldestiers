package ecolededev.pe.home;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import ecolededev.pe.services.IPartenaireServices;
import ecolededev.pe.services.IConventionServices;
import ecolededev.pe.domaine.Contact;
import ecolededev.pe.domaine.Convention;
import ecolededev.pe.domaine.Partenaire;
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
			}
			return "home/homeSignedIn";
		}
	}


	@PostMapping("/rechercher")
	String rechercher(Principal principal, @ModelAttribute HomeForm form) {
		String partenaire = form.getPartenaire();
		Partenaire p = partenaireServices.getPartenaire(partenaire);
		if (p != null ) {
			
			List<Convention> l = p.getConventions();
			form.setObjetPartenaire(p);
			List<Contact> contacts = new ArrayList<>();
			for(Convention c:l) {
				contacts.add(c.getContact());
			}
			form.setListeConventions(l);
			form.setListeContacts(contacts);
		}
		return "home/homeSignedIn";
	}
} 
