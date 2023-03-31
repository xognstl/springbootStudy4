package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @RestController 반환 값으로 HTTP 메시지 바디에 바로 입력
* @Controller 반환 값이 String 이면 뷰 이름으로 인식
* log level : TRACE > DEBUG > INFO > WARN > ERROR
* */
@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "spring";

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        /* 아래와 같이 로그를 찍으면 trace 가 안찍혀도 + 연산이 일어난 후 안찍는다(메모리 낭비) */
//        log.trace("trace my log="+name);

        return "ok";
    }
}
