package DouglasGuacaran.Eva_Int_Mod_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

	@GetMapping("/about")
	public String about() {
		return "about";
	}
}
