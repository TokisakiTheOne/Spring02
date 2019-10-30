import com.yyh.dao.StudentDaoImpl;
import com.yyh.po.Student;
import com.yyh.po.TestBean;
import config.TestConfiguration;
import config.TestSpringJdbcConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @RunWith 把单元测试交给spring管理
 * @ContextConfiguration 能给加载配置文件 以及配置类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestSpringJdbcConfig.class})
public class TestConfigAnnotation {
    @Autowired
    StudentDaoImpl sd;

    @org.junit.Test
    public void testSpringAnnotationSpringJdbc() {
        List<Student> students = sd.selectAll();
        for (Student student : students) {
            System.out.println("student = " + student);
        }

    }

}
