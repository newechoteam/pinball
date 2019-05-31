package echo.entity;

public class Test {
	
	private Integer testId;
	private String testName;
	
	public Test() { }
	public Test(Integer testId, String testName) {
		super();
		this.testId = testId;
		this.testName = testName;
	}
	public Integer getTestId() {
		return testId;
	}
	public void setTestId(Integer testId) {
		this.testId = testId;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}

}
