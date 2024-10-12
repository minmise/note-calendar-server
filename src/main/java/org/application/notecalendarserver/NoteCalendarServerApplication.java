package org.application.notecalendarserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EntityScan(basePackages = {"org.application.notecalendarserver.model"})
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class NoteCalendarServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteCalendarServerApplication.class, args);
	}

}
