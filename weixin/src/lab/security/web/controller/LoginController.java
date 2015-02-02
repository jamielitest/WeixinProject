package lab.security.web.controller;

import lab.security.entity.AjaxResult;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/** 
 * @author zzk
 * @version 1.0
 * 处理登录请求
 */
@Controller
public class LoginController {

	@RequestMapping("/loginCheck")
	@ResponseBody
	public AjaxResult checkLogin(@RequestParam String name) {
		AjaxResult ar = new AjaxResult();
		System.out.println("ddddddddddddddddddd");
		
		return ar;
	}
	
	@RequestMapping("/login") 
	public ModelAndView handleLogin() {
		ModelAndView mv=new ModelAndView();
		
		mv.setViewName("login");
		System.out.println("dggggggggggggggggggg");
		
		return mv;
	}
}
