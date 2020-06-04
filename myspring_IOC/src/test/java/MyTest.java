import hanmingwu.dao.UserDaoMysqllmpl;
import hanmingwu.dao.UserDaoOlclmpl;
import hanmingwu.service.UserServicelmpl;

public class MyTest {
    public static void main(String[] args) {

        UserServicelmpl useDao = new UserServicelmpl();
        useDao.setUserDao(new UserDaoOlclmpl());
        useDao.getUser();


    }
}
