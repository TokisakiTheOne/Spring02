package config;

import com.yyh.po.TestBean;
import org.springframework.context.annotation.*;

/**
 * 1.类不能是final类型
 * 2.类不能是匿名类
 *
 * @author YanYuHang
 * @create 2019-10-27-11:35
 */
@Configuration
/**添加自动扫描注解*/
@ComponentScan(basePackages = "com.yyh.po")
public class TestConfiguration {
    public TestConfiguration() {
        System.out.println("spring容器启动并且初始化.........");
    }

    /**
     *
     * @Scope("prototype") 自定义bean的作用域
     * @return
     * @Bean 注册bean
     */
  /*  @Bean(name = "testBean", initMethod = "start", destroyMethod = "cleanUp")
    public TestBean testBean() {
        TestBean testBean = new TestBean();
        testBean.setName("张三");
        testBean.setSex("女");
        return testBean;
    }*/
}
