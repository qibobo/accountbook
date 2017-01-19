package qiye.accountbook.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import qiye.accountbook.domain.User;
import qiye.accountbook.service.UserService;

@Controller
@RequestMapping("/operation")
public class DemoController {

	@Resource(name="userService")
	private UserService userService;
	@RequestMapping("/demo")
	public String login(ModelMap model) {
		User u = new User();
		u.setName("qiye");
		u.setPassword("123");
		userService.getUser(u);
		model.addAttribute("name", "qibobo");
		return "index";
	}

}
