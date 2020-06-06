import fun.hanmingwu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testAnnot(){
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation-context.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
