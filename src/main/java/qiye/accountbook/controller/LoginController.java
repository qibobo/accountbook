package qiye.accountbook.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import qiye.accountbook.domain.User;
import qiye.accountbook.service.UserService;

@Controller
public class LoginController {
	
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, HttpServletRequest request, HttpSession session) {
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String targetUri = (String)request.getSession().getAttribute("targetUri");
		System.out.println("target" + targetUri);
		User user = new User();
		user.setName(userName);
		user.setPassword(password);
		user = userService.getUser(user);
		if (null == user) {
			return "login";
		}else{
			session.setAttribute("userId", user.getId());
			model.addAttribute("userId", user.getId());
			return targetUri;
		}

	}
}
