package web.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.dto.BuyerInfo;
import web.service.face.BuyerService;

@Controller
public class BuyerController {
	
	@Autowired BuyerService buyerService;
	
	@RequestMapping(value="/buyer/mailsender", method=RequestMethod.POST)
	public String mailsender(HttpServletRequest request, Model model, String email, HttpSession sess) {
		
//		System.out.println("받아온 이메일"+email);
		
		// 네이버일 경우 smtp.naver.com 을 입력합니다. // Google일 경우 smtp.gmail.com 을 입력합니다. 
		String host = "smtp.naver.com"; //건들지마세요
		final String username = ""; //네이버 아이디를 입력해주세요. @naver.com은 입력하지 마시구요. 
		final String password = ""; //네이버 이메일 비밀번호를 입력해주세요. 
		int port=465; //포트번호 건들지마세요
		
		String emailCode = UUID.randomUUID().toString().split("-")[0];
		
		Map map = new HashMap();
		map.put("emailCode", emailCode);
//		
		model.addAllAttributes(map);
//		sess.setAttribute("emailCode", emailCode);
		
		// 메일 내용 
		String recipient = email; //받는 사람의 메일주소를 입력해주세요. 
		String subject = "가입인증 메일입니다"; //메일 제목 입력해주세요. 
		String body = "인증코드란에"+emailCode+"를 써주세요"; //메일 내용 입력해주세요. 
		Properties props = System.getProperties(); 
		
		// 정보를 담기 위한 객체 생성 
		// SMTP 서버 정보 설정 
		props.put("mail.smtp.host", host); 
		props.put("mail.smtp.port", port); 
		props.put("mail.smtp.auth", "true"); 
		props.put("mail.smtp.ssl.enable", "true"); 
		props.put("mail.smtp.ssl.trust", host); 
		
		//Session 생성 
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
		String un=username; String pw=password; 
		
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			
			return new javax.mail.PasswordAuthentication(un, pw);
			
			} 
		}); 
		
		session.setDebug(true); //for debug 
		
		Message mimeMessage = new MimeMessage(session); //MimeMessage 생성
		try {

			mimeMessage.setFrom(new InternetAddress("")); 
			//자신의 이메일 풀로 넣어주세요
			// ex) jhb0205_@naver.com

			mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));//수신자셋팅 //.TO 외에 .CC(참조) .BCC(숨은참조) 도 있음 
			
			mimeMessage.setSubject(subject); //제목셋팅 
			
			mimeMessage.setText(body); //내용셋팅 
			
			Transport.send(mimeMessage); 
			//javax.mail.Transport.send() 이용
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} //발신자 셋팅 , 보내는 사람의 이메일주소를 한번 더 입력합니다. 
		//이때는 이메일 풀 주소를 다 작성해주세요. 
		
		return "jsonView";
		
	}
	
	@RequestMapping(value="/buyer/code", method=RequestMethod.GET)
	public void emailcode() { }
	
	@RequestMapping("/buyer/useid")
	public String useid(Model model, BuyerInfo bi) {
		
		boolean id = buyerService.haveId(bi);
		
		Map map = new HashMap();
		if(id) {
			map.put("haveId", true);
		}else {
			map.put("haveId", false);
		}
		
		model.addAllAttributes(map);
		
		return "jsonView";
	}
	
	@RequestMapping(value="/buyer/join", method=RequestMethod.GET)
	public void mailform() { }
		
	//회원가입
	@RequestMapping(value="/buyer/join", method=RequestMethod.POST)
	public String buyerJoin(BuyerInfo buyerInfo) {
		
//		System.out.println(buyerInfo.toString());
		
		buyerService.buyerJoin(buyerInfo);
		
		return "/buyer/login";
	}
	
	
	@RequestMapping(value="/buyer/login", method=RequestMethod.GET)
	public void buyerLoginForm() { }
	
	@RequestMapping(value="/buyer/login", method=RequestMethod.POST)
	public String buyerLogin(BuyerInfo buyerInfo, HttpSession session) {
		
		boolean user = buyerService.buyerLogin(buyerInfo);
		
//		System.out.println(buyerInfo.getBuyerId());
		
		if(user) {
			session.setAttribute("haveBuyerId", true);
			session.setAttribute("buyerId", buyerInfo.getBuyerId());
			
			return "redirect:/buyer/login";
		}
		session.setAttribute("haveBuyerId", false);
		
		return "redirect:/buyer/login";
		
	}
	
	@RequestMapping(value="/buyer/logout", method=RequestMethod.GET)
	public String buyerLogout(HttpSession session) {
		
		session.invalidate();
		
		return "redirect:/buyer/login";
	}
	
}
