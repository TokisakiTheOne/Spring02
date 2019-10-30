package config;

import com.yyh.dao.StudentDaoImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Driver;

/**
 * @author YanYuHang
 * @Configuration  标明当前类是配置类
 * @PropertySource 可以加载配置文件
 * @create 2019-10-30-18:19
 */
@Configuration
@ComponentScan(basePackages = "com.yyh")
@PropertySource("classpath:db.properties")
public class TestSpringJdbcConfig {

    @Value("${jdbc.driverClassName}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;




    @Bean(name = "dataSource")
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
    @Bean(name="jdbc")
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return  jdbcTemplate;
    }
    /*@Bean(name = "studentDao")
    public StudentDaoImpl studentDao(){
        StudentDaoImpl sd = new StudentDaoImpl();
        sd.setJdbcTemplate(jdbcTemplate());
        return sd;
    }
*/
}
