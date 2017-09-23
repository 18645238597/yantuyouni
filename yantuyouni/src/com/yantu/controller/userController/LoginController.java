/**
 * 
 */
package com.yantu.controller.userController;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yantu.pojo.User;
import com.yantu.service.UserService.UserService;

/**
 * 2017-9-19下午9:29:10
 * 
 * 登陆页
 */
@Controller
@RequestMapping("/user")
public class LoginController {
	private Logger logger = Logger.getLogger(LoginController.class);
	@Resource
	UserService userService;

	@RequestMapping("/login")
	public ModelAndView login(User user) {
		ModelAndView mv = new ModelAndView();
		try {
			User userl = userService.getLoginUser(user);
			System.out.println("-============userl" + userl);
			if (userl != null) {
				mv.addObject(userl);
				mv.setViewName("/register");
			} else {
				mv.addObject("登陆失败");
				mv.setViewName("/index");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return mv;
		}
	}

}
