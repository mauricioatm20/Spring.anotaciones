package es.cursogetafe.springxml.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@ComponentScan(basePackages = {
		"es.cursogetafe.springxml.persistencia",
		"es.cursogetafe.springxml.negocio"
		})



@Import({DesarrolloConfig.class, ProduccionConfig.class})
@PropertySource("classpath:app.properties")
public class AppConfig {


}
