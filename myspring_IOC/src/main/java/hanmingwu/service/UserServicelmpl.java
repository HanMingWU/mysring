package hanmingwu.service;

import hanmingwu.dao.UserDao;

/**
 * @author yuki
 * 业务层实现Dao层
 */
public class UserServicelmpl implements UserService {
    private UserDao userDao;

    /**
     * 用set注入就可以实现用户实现调用
     * @param userDao
     */
    public void setUserDao(UserDao userDao){
        this.userDao=userDao;

    }

    /**
     * 相同的方法名实现数据层
     */
    public void getUser() {
        userDao.getUser();

    }
}
