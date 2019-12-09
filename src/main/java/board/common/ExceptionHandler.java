package board.common;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {
	
	/*
	defaultExceptionHandler는 맨 하단에 위치하고
	각각의 Exception을 처리하는 메소드를 개별로 추가한다
	아래 defaultExceptionHandler 만으로 처리하지 않도록 주의
	*/
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public ModelAndView defaultExceptionHandler(HttpServletRequest request, Exception exception){
		ModelAndView mv = new ModelAndView("/error/error_default");
		mv.addObject("exception", exception);
		
		log.error("defaultExceptionHandler", exception);
		
		return mv;
	}
}
