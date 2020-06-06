package fun.hanmingwu.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于在beans里面配置，组件
@Component
public class User {

    public String name ;
    @Value("hanming")
    public void setName(String name) {
        this.name = name;
    }
}
