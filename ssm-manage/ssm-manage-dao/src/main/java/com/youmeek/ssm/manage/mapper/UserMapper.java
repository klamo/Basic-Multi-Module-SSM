package com.youmeek.ssm.manage.mapper;



import com.youmeek.ssm.manage.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public User queryUserById(Long id);

    public User queryUserByUserNameAndPassword(@Param("userName") String userName,
                                               @Param("password") String password);

    public void saveUser(User user);

    public void updateUserById(User user);

    public void deleteUserById(Long id);

}
