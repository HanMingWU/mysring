import fun.hanmingwu.config.HanConfig;
import fun.hanmingwu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {
    @Test
    public  void test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HanConfig.class);
        User user = context.getBean("getUser", User.class);
        System.out.println(user.getName());

    }
}
