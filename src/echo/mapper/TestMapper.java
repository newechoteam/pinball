package echo.mapper;

import org.apache.ibatis.annotations.Param;

import echo.entity.Test;

/**
 * 此接口类配合同名xml文件（TestMapper.xml）访问数据库
 * @date 2019年5月31日
 */
public interface TestMapper {

	int insertTest(Test test);
	Test getTestbyId(@Param("testId") int testId);
	
}
