# Spring的使用步骤
* 所有的类都需要装配到bean里面
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">

    <context:annotation-config/>
    <bean id="dog" class="Dog"/>
    <bean id="cat" class="Cat"/>
    <bean id="people" class="People"/>

</beans>
```
* 所有的bean都需要容器context去取
* 容器取得的bean，拿出来就是一个对象
```java
public class Mytest2 {
    @Test
    public void testPeople(){
     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        people.getCat().say();
        
    }
}
```
## IoC创建对象的方式
* 无参构造方法来创建
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd">

   <bean id="user" class="com.kuang.pojo.User">
       <property name="name" value="kuangshen"/>
   </bean>

</beans>
```
* 有参构造（三种）
```xml
<!-- 第一种根据index参数下标设置 -->
<bean id="userT" class="com.kuang.pojo.UserT">
   <!-- index指构造方法 , 下标从0开始 -->
   <constructor-arg index="0" value="kuangshen2"/>
</bean>
```
```xml
<!-- 第二种根据参数名字设置 -->
<bean id="userT" class="com.kuang.pojo.UserT">
   <!-- name指参数名 -->
   <constructor-arg name="name" value="kuangshen2"/>
</bean>
```
```xml
<!-- 第三种根据参数类型设置 -->
<bean id="userT" class="com.kuang.pojo.UserT">
   <constructor-arg type="java.lang.String" value="kuangshen2"/>
</bean>
```
## Spring配置
* 别名
>>alias 设置别名 , 为bean设置别名 , 可以设置多个别名
```xml
<!--设置别名：在获取Bean的时候可以使用别名获取-->
<alias name="userT" alias="userNew"/>
```


* Bean的配置
```xml
<!--bean就是java对象,由Spring创建和管理-->

<!--
   id 是bean的标识符,要唯一,如果没有配置id,name就是默认标识符
   如果配置id,又配置了name,那么name是别名
   name可以设置多个别名,可以用逗号,分号,空格隔开
   如果不配置id和name,可以根据applicationContext.getBean(.class)获取对象;

class是bean的全限定名=包名+类名
-->
<bean id="hello" name="hello2 h2,h3;h4" class="com.kuang.pojo.Hello">
   <property name="name" value="Spring"/>
</bean>
```


* import
>>团队的合作通过import来实现 .
```xml
<import resource="{path}/beans.xml"/>
```
## 注解
首先要进行扫描
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
    <context:component-scan base-package="fun.fun.hanmingwu"/>

</beans>
```
@Component三个衍生注解

为了更好的进行分层，Spring可以使用其它三个注解，功能一样，目前使用哪一个功能都一样。

@Controller：web层

@Service：service层

@Repository：dao层

写上这些注解，就相当于将这个类交给Spring管理装配了！
>小结
   * XML可以适用任何场景 ，结构清晰，维护方便;
   注解不是自己提供的类使用不了，开发简单方便
    
   * xml与注解整合开发 ：推荐最佳实践
    xml管理Bean
    注解完成属性注入
    使用过程中， 可以不用扫描，扫描是为了类上的注解结

