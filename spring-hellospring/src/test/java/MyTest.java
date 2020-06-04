import fun.hanmingwu.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User hello = (User) context.getBean("hello");
        String name = hello.getName();
        int age = hello.getAge();
        System.out.println(age);
        System.out.println(name);
    }

    @Test
    public void testUser() {
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans.xml"
        );

        User user = (User) applicationContext.getBean("user");
        String name = user.getName();
        System.out.println(name);


    }

}

