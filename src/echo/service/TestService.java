package echo.service;

import echo.entity.Test;

/*
 * 定义接口
 */
public interface TestService {

	public boolean insertTest(int testId, String testName);
	public Test getTest(int testId);
	
}
