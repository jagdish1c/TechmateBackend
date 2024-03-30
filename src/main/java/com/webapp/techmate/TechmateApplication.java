package com.webapp.techmate;
import com.webapp.techmate.service.Mailsender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechmateApplication {
	@Autowired
	private Mailsender mailsender;

	public static void main(String[] args) {
		SpringApplication.run(TechmateApplication.class, args);
	}


}
