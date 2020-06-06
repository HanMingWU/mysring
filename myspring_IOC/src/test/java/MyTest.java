import fun.hanmingwu.dao.UserDaoOlclmpl;
import fun.hanmingwu.service.UserServicelmpl;

public class MyTest {
    public static void main(String[] args) {

        UserServicelmpl useDao = new UserServicelmpl();
        useDao.setUserDao(new UserDaoOlclmpl());
        useDao.getUser();


    }
}
