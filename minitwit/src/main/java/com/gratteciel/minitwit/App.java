package com.gratteciel.minitwit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gratteciel.minitwit.config.WebConfig;
import com.gratteciel.minitwit.service.impl.MiniTwitService;

@Configuration
@ComponentScan({ "com.minitwit" })
public class App {
	
	public static void main(String[] args) {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
    	new WebConfig(ctx.getBean(MiniTwitService.class));
        ctx.registerShutdownHook();
    }
    
    
}
