package web.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.SellerInfo;
import web.service.face.SellerService;

@Controller
public class SellerController {
	
	private static final Logger logger
	= LoggerFactory.getLogger(SellerController.class);
	
	@Autowired SellerService sellerService;
	
	@RequestMapping(value="/seller/main", method=RequestMethod.GET)
	public void sellerMain() { }
	
	@RequestMapping(value="/seller/login", method=RequestMethod.POST)
	public String sellerLogin(
			SellerInfo sellerInfo,
			HttpSession session) {
		
		if(sellerService.login(sellerInfo)) {
			session.setAttribute("sellerLogin", true);
			session.setAttribute("sellerId", sellerInfo.getSellerId());
		}
		
		logger.info(sellerInfo.toString());
		
		return "redirect:/seller/main";
	}
	
	@RequestMapping(value="/seller/logout", method=RequestMethod.GET)
	public String sellerLogout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/seller/main";
	}

}
