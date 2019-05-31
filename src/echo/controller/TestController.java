package echo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import echo.entity.Test;
import echo.service.TestService;

/**
 * 和兴控制层，与前端打交道
 * @date 2019年5月31日
 */
//注解将类变为spring的bean，spring能管理
@Controller
//前端访问后端的虚拟路径
@RequestMapping("test")
public class TestController {

	//自动注入，不用new对象，方便管理
	@Autowired
	private TestService ts;
	
	//前端访问后端的虚拟路径
	@RequestMapping("/newTest")
	public String newTest(int testId, String testName, HttpServletRequest request) {
		//直接用参数名称接收前端参数，名称必须与前端相符
		boolean result = ts.insertTest(testId, testName);
		if(result)
			request.setAttribute("message", "插入成功");
		else
			request.setAttribute("message", "失败");
		//跳转到jsp页面（带参数）
		return "/result.jsp";
	}
	@RequestMapping("/getTest")
	@ResponseBody  //注解使test实体类变为json格式字符串传给前端
	public Test getTest(int testId) {
		return ts.getTest(testId);
	}
	
}
