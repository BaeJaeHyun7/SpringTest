package global.sesoc.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.sample.service.PersonService;
import global.sesoc.sample.vo.Person;

/**
 * 사용자 입력을 받아 처리
 */
@Controller
public class InputController {
	
	private static final Logger logger = LoggerFactory.getLogger(InputController.class);

	@Autowired
	private PersonService service;

	/**
	 * 입력 폼으로 이동
	 * @return
	 */
	@RequestMapping(value = "/inputForm", method = RequestMethod.GET)
	public String goInputForm() {
		logger.info("입력 폼으로 이동");
		return "inputForm";
	}
	
	@RequestMapping(value="input", method = RequestMethod.POST)
	public String insertPerson(Person person) {
		logger.debug("폼으로부터 전달된 정보 : {}", person.toString());
		//{}영역에 person.toString을 쓰겠다는 말
		int cnt = service.insertPerson(person);
		
		if(cnt == 0) {
			logger.info("회원 가입 실패");
		}else {
			logger.info("회원 가입 성공");
		}
		
		//return "home";
		//redirect : + 요청주소(/)
		//
		
		return "redirect:/";
	}
}
