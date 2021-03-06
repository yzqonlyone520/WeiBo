package com.yzq.weibo.service;

import com.yzq.weibo.model.Description;
import com.yzq.weibo.model.User;
import com.yzq.weibo.model.Weibo;

public interface UserService {

    public User checkUserLogin(User user) throws Exception;

    public Description descriptionById(int user_id) throws Exception;

    public void insertUser(User user) throws Exception;

    public void insertDescription(Description description) throws Exception;

    public User checkUser(User user)throws Exception;

    public void writeWeibo(Weibo weibo) throws Exception;

    public void updateDescription(Description description) throws Exception;

}
