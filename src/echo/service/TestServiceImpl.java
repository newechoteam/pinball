package echo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import echo.entity.Test;
import echo.mapper.TestMapper;
import echo.service.TestService;

/**
 * 此类主要是处理业务逻辑
 * 处理controller层的请求，调用mapper层访问数据库，将得到的数据经过处理后，返回给controller
 * @date 2019年5月31日
 */
@Service
public class TestServiceImpl implements TestService{

	//不用new对象，自动注入
	@Autowired
	private TestMapper tm;
	
	@Override
	public boolean insertTest(int testId, String testName) {
		Test test = new Test(testId, testName);
		int num = tm.insertTest(test);
		return (num == 1);
	}
	@Override
	public Test getTest(int testId) {
		Test test = tm.getTestbyId(testId);
		if(test==null)
			test = new Test(0, "defaultName");
		return test;
	}

}

