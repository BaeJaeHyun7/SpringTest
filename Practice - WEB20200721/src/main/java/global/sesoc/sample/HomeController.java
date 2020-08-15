package global.sesoc.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 메인 화면으로 이동하는 요청 처리
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	// 복붙해도 되지만 뒤에 클래스만 지정해서 씀
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		logger.info("메인 화면으로 이동");	//서버에서도 출력이 되고 파일로도 저장이 된다. log레벨에 따라서 출력구문을 설정.
		System.out.println("test");   // 개발환경의 IDE 콘솔창에서만 출력되는 출력구문,서버에선 안보임
		return "home";
	}
	
}
