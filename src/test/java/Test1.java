import com.yyh.po.DemoInterFace;
import com.yyh.po.Person;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class Test1 {

    @org.junit.Test
    public void testSpring() {
        DemoInterFace d = new DemoInterFace() {
            public void show() {
                System.out.println("123");
            }
        };

        d.show();
    }

    @org.junit.Test
    public void testSpring1() {
        DemoInterFace d = () ->{
            System.out.println("1");
            System.out.println("2");
        };
        d.show();
    }
}
