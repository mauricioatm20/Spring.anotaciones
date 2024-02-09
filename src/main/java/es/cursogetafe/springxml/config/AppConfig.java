package es.cursogetafe.springxml.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = {"es.cursogetafe.springxml.persistencia",
							   "es.cursogetafe.springxml.negocio"
								})

@PropertySource("classpath:app.properties")
public class AppConfig {

	@Autowired
	Environment prop;
	
	public DataSource ds() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName(prop.getProperty("bbdd.driver"));
		bds.setUrl(prop.getProperty("bbdd.url"));
		bds.setUsername(prop.getProperty("bbdd.user"));
		bds.setPassword(prop.getProperty("bbdd.pass"));
		return bds;
	}
	
}
