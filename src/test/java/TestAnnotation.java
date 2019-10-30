import com.yyh.po.TestBean;
import config.TestConfiguration;
import config.TestSpringJdbcConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TestAnnotation {

    @org.junit.Test
    public void testSpringAnnotation() {
        /**加载@configuration注解的spring容器
         用AnnotationConfigApplicationContext 代替
         ClassPathXmlApplicationContext
         */
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TestConfiguration.class);

        TestBean testBean = (TestBean) ctx.getBean("testBean");
        Object testBean1 = ctx.getBean("testBean");
        System.out.println("testBean = " + testBean);
        System.out.println("testBean1 = " + testBean1);
        //加载spring配置文件     初始化IOC容器
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("");
    }


    @org.junit.Test
    public void testSpringAnnotationSpringJdbc() {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(TestSpringJdbcConfig.class);

    }

}
