package com.yantu.dao.user;

import com.yantu.pojo.User;

public interface UserMapper {
	/**
	 * 用户注册
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int registerUser(User user) throws Exception;

	/**
	 * getLoginUser 用户登录
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User getLoginUser(User user) throws Exception;

	/**
	 * userIsExit 判断手机号或者邮箱是否已经注册过
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int userIsExit(User user) throws Exception;

	/**
	 * modifyUser 修改用户方法
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int modifyUser(User user) throws Exception;

}
