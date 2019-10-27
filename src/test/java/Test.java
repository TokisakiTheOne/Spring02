import com.yyh.po.Address;
import com.yyh.po.HelloWorld;
import com.yyh.po.NewAddress;
import com.yyh.po.Person;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans4.xml")
public class Test {
    /*@Autowired          //能够根据类型获取对象
    @Qualifier("p1")//如果同一个类型有多个对应的Bean，可以用id名称区分
    Person person;

    @org.junit.Test
    public void testSpringTest() {
        System.out.println("person = " + person);













        System.out.println("person = " + person);
    }
    
    */
    
    
    
    
    
    
    
    /*@org.junit.Test
    public void testEntity() {
        //1.创建对象
        HelloWorld helloWorld = new HelloWorld();
        //2.用对象名.set访问器的方式赋值
        helloWorld.setName("hello");
        
        //3.调用方法  输出
        System.out.println("helloWorld = " + helloWorld);
    }
    */
    @org.junit.Test
    public void testSpring() {
        //1.加载spring的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans4.xml");
        
        //2.根据容器中设置的id属性获取对应的对象
        Object hello = ctx.getBean("p1");
        Object hello1 = ctx.getBean("p1");
        Object hello2 = ctx.getBean("p1");
        //3.输出
        System.out.println("hello = " + hello);
        System.out.println("hello = " + hello1);
        System.out.println("hello = " + hello2);



    }
}
