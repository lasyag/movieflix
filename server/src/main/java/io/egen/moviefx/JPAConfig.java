
package io.egen.moviefx;

import java.util.Properties;

import javax.activation.DataSource;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JPAConfig {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean()
	{
		LocalContainerEntityManagerFactoryBean	emf= new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource((javax.sql.DataSource) dataSource());
        JpaVendorAdapter adapter= new HibernateJpaVendorAdapter();
       emf.setJpaVendorAdapter(adapter);
       emf.setJpaProperties(properties());
        return emf ;
      }

@Bean
public DataSource dataSource()
    {
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/happy");
	ds.setUsername("root");
	ds.setPassword("Lasyashica552");
	return (DataSource) ds;
	
}
@Bean
public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
	JpaTransactionManager transactionManager=new JpaTransactionManager(emf);
	return transactionManager;
	
}
private Properties properties()
{
	Properties props=new Properties();
	props.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
	props.setProperty("hibernate.hbm2ddl.auto","create");
	props.setProperty("hibernate.show_sql","true");
	props.setProperty("hibernate.format_sql","true");
	return props;
	
}

}