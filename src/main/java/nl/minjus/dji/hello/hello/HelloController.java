package nl.minjus.dji.hello.hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping(path = { "", "hello" })
	public String hello() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.S");
		return "Hallo, het is nu " + sdf.format(new Date());
	}
}
