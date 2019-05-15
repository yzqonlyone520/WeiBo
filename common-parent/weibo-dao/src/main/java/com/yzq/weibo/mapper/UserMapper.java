package com.yzq.weibo.mapper;

import com.yzq.weibo.mapper.base.BaseMapper;
import com.yzq.weibo.model.Description;
import com.yzq.weibo.model.User;

public interface UserMapper extends BaseMapper<User> {

    public User checkUserLogin(User user) throws Exception;

    public Description descriptionById(int user_id) throws Exception;

}
