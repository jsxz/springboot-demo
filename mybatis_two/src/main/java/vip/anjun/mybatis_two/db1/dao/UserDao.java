package vip.anjun.mybatis_two.db1.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import vip.anjun.mybatis_two.domain.User;

@Qualifier("db1SqlSessionTemplate")
public interface UserDao {
    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM user WHERE name = #{name}")
    User findUserByName(String name);

}
