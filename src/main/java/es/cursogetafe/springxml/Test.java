package es.cursogetafe.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.cursogetafe.springxml.config.AppConfig;
import es.cursogetafe.springxml.negocio.Negocio1;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		Negocio1 neg = ctx.getBean("neg", Negocio1.class);
		neg.metodoNegocio();
	}

}
