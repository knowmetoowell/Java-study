package net.developia.spring02.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import lombok.extern.log4j.Log4j;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration("file:**/*-context.xml")
@Log4j
public class DataSourceTests {
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try (Connection con = dataSource.getConnection()){
			log.info(con);
		} catch(Exception e) {
			fail(e.getMessage());;
		}
	}
}
