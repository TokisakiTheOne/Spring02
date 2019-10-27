package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author YanYuHang
 * @create 2019-10-27-12:06
 */
@Configuration
@ImportResource("classpath:spring-beans.xml")
@Import(TestConfiguration.class)
public class MyConfig {
}
