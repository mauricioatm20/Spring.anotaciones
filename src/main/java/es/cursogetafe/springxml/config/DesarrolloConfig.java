package es.cursogetafe.springxml.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
@Profile("desarrollo")
public class DesarrolloConfig {

	@Autowired
	Environment prop;
	@Bean
	public DataSource ds() {
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName(prop.getProperty("bbdd.external.driver"));
		bds.setUrl(prop.getProperty("bbdd.external.url"));
		bds.setUsername(prop.getProperty("bbdd.external.user"));
		bds.setPassword(prop.getProperty("bbdd.external.pass"));
		return bds;
	}
	
}
