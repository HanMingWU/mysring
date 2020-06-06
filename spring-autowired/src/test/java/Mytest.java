import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void testPeople(){
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("p3", People.class);
        people.getCat().say();
        System.out.println(people.getDog().getName());


    }
}
