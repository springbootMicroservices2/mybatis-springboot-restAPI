package com.example.mybatis3.demo;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DatasouceConfig {
	
	  @Bean
	  public DataSource dataSource() {
		  DriverManagerDataSource ds =
				  new DriverManagerDataSource("jdbc:mysql://localhost:3306/elearning?useSSL=false&allowPublicKeyRetrieval=true", "root", "admin");
		  ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    return ds ;
	  }

	  @Bean
	  public SqlSessionFactory sqlSessionFactoryBean() throws Exception {

	    SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
	    sqlSessionFactoryBean.setDataSource(dataSource());

	    PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

	    sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:**/mappers/*.xml"));
	    sqlSessionFactoryBean.setTypeAliasesPackage("com.example.mybatis3.demo.domain");
	    sqlSessionFactoryBean.setTypeHandlersPackage("com.example.mybatis3.demo.typeHandler");
	    return sqlSessionFactoryBean.getObject();
	  }

	  @Bean
	  public PlatformTransactionManager transactionManager() {
	    return new DataSourceTransactionManager(dataSource());
	  }
	 
	
}
