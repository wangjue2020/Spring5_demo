package com.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DBTester {
    @Test
    public void testDatabaseConnectionUsingProperties() throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        DataSource druid = context.getBean("druid", DataSource.class);
        System.out.println(druid.getConnection());
    }

    @Test
    public void testDatabaseConnection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("db_xml.xml");
        DruidDataSource druidDatabaseDataSource = context.getBean("druidDatabaseDataSource", DruidDataSource.class);
        DruidPooledConnection connection = null;
        try {
            connection = druidDatabaseDataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}
