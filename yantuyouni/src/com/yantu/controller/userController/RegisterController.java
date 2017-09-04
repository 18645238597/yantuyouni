/**
 * 
 */
package com.yantu.controller.userController;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yantu.controller.UserController;
import com.yantu.pojo.User;
import com.yantu.service.UserService.UserService;

/**
 * 2017-8-27下午2:59:06 用户注册controller
 */
@Controller
@RequestMapping("/user")
public class RegisterController {
	private Logger logger = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;

	@RequestMapping("/register")
	public ModelAndView register(@ModelAttribute User user) {
		ModelAndView mv = null;
		if (user.getUserPhone() != null && !user.getUserPhone().equals("")
				&& user.getUserPassword() != null
				&& !"".equals(user.getUserPassword())) {
			try {
				int i = userService.registerUser(user);
				if (i > 0) {
					mv = new ModelAndView("main.jsp");
					System.out.println("注册成功！");
				} else {
					mv = new ModelAndView("");
					System.out.println("注册失败!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			mv = new ModelAndView("");
		}
		return mv;
	}
}
