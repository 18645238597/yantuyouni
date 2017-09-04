package com.yantu.service.UserService;

import com.yantu.pojo.User;

public interface UserService {
	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int registerUser(User user) throws Exception;

	/**
	 * getLoginUser 获取用户登陆
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(User user) throws Exception;

	/**
	 * userIsExit 判断手机号或者邮箱是否存在
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int userIsExit(User user) throws Exception;

	/**
	 * modifyUser 更新当前用户的方法
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int modifyUser(User user) throws Exception;

}
