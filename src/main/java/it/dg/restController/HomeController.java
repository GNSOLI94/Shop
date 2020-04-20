package it.dg.restController;


import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import it.dg.pojo.FotoBean;
import it.dg.pojo.User;
import restServicesInterfaces.HomeServiceInterface;


/*
 * Il controller è una interfaccia che riceve una richiesta HTTP
 */

@MultipartConfig(maxFileSize = 18000000)
@RestController 
class HomeController {

	@Autowired
	private HomeServiceInterface hsi;

	// home page
	@RequestMapping("/homeForm")
	public ModelAndView homeGet(User u, HttpSession session) {
		if(session.getAttribute("idUtente") == null)
			return new ModelAndView("login");
		
		ModelAndView utenteView = new ModelAndView("homeForm");
		utenteView.addObject("nomeUser", u.getNome());
		utenteView.addObject("cognomeUser", u.getCognome());
//		utenteView.addObject("fotoForm", new FotoForm());
		
		return utenteView;
	}


//	@RequestMapping(value="/uploadfoto", method = RequestMethod.GET)
//	public ModelAndView uploadFotoGet(Model model, HttpSession session) {
//		model.addAttribute("fotoForm", new FotoForm());
//			return new ModelAndView("home");
//	}
	
	
	// form invio dati login POST
	@RequestMapping(value="/uploadfoto", method = RequestMethod.POST)
	public ModelAndView uploadFotoPost(MultipartFile photoToUpload, String descrizione, HttpSession session) {
		//TODO migliorare i controlli
		
		FotoBean fotoForm = new FotoBean();
		
		if(photoToUpload != null) {
//			fotoForm.setPhotoToUpload(photoToUpload);
//			fotoForm.setDescrizione(descrizione);
			
//			hsi.insertFoto(fotoForm);
			return new ModelAndView();
		}
		else
			return new ModelAndView("home");
	}
	
	@RequestMapping(value="/caricafoto", method = RequestMethod.POST)
	public ModelAndView uploadFotoPost(@RequestParam("descrizioneFoto") String descrizioneFoto, @RequestParam("photoToUpload") MultipartFile photoToUpload, HttpSession session, BindingResult bindingResult) {
		
//		if(photoToUpload.isEmpty()) {
//			try {
//				byte [] bytes = photoToUpload.getBytes();
//				
//				String rootPath = System.getProperty("catalina.home");
//				
//				File dir = new File (rootPath + File.separator + "tmpFiles");
//				
//				if(!dir.exists())
//					dir.mkdirs();
//				
//				File serverFile = new File(dir.getAbsolutePath() + File.separator + descrizioneFoto);
//				
//				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
//				
//				stream.write(bytes);
//				stream.close();
//				System.out.println("Server file location " + serverFile.getAbsolutePath());
//				return new ModelAndView("home");
//			}catch (Exception e) {
//				System.out.println("errore nel caricare la foto " + e);
//				return new ModelAndView("home");
//			}
//		}
		
		return new ModelAndView("home");
	}
	
	
	
	//Log out
	@RequestMapping("/logout")
	public ModelAndView logOut(HttpSession session) {
		session = null;
		return new ModelAndView("login");
	}

}
