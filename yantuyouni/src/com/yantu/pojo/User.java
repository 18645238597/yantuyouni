package com.yantu.pojo;

import java.util.Date;

/**
 * User
 * 
 * @author yanran
 * 
 */
public class User extends Base {
	private Integer userId; // 主键id
	private String userName; // 用户名
	private String userSex; // 性别
	private Integer userPhone; // 用户电话
	private String userOccupAtion; // 职业
	private String userPassword; // 密码
	private String password2; // 确认密码
	private String userUickName; // 昵称
	private String userType; // 用户类型
	private Date birthday; // 生日
	private String email; // 用户邮箱
	private String emailPassword;// 用户邮箱登陆密码
	private String userAddress; // 用户地址
	private Integer bankNo; // 银行卡号
	private String bankType; // 银行卡类型（交行，工行等）
	private Date lastUpdateTime; // 修改时间
	private Date lastLoginTime; // 登陆时间
	private Date createTime; // 注册时间
	private String pictureHead;// 头像图片

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Integer getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserOccupAtion() {
		return userOccupAtion;
	}

	public void setUserOccupAtion(String userOccupAtion) {
		this.userOccupAtion = userOccupAtion;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getUserUickName() {
		return userUickName;
	}

	public void setUserUickName(String userUickName) {
		this.userUickName = userUickName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getBankNo() {
		return bankNo;
	}

	public void setBankNo(Integer bankNo) {
		this.bankNo = bankNo;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPictureHead() {
		return pictureHead;
	}

	public void setPictureHead(String pictureHead) {
		this.pictureHead = pictureHead;
	}

	public String getEmailPassword() {
		return emailPassword;
	}

	public void setEmailPassword(String emailPassword) {
		this.emailPassword = emailPassword;
	}

	public User(Integer userId, String userName, String userSex,
			Integer userPhone, String userOccupAtion, String userPassword,
			String password2, String userUickName, String userType,
			Date birthday, String email, String emailPassword,
			String userAddress, Integer bankNo, String bankType,
			Date lastUpdateTime, Date lastLoginTime, Date createTime,
			String pictureHead) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userOccupAtion = userOccupAtion;
		this.userPassword = userPassword;
		this.password2 = password2;
		this.userUickName = userUickName;
		this.userType = userType;
		this.birthday = birthday;
		this.email = email;
		this.emailPassword = emailPassword;
		this.userAddress = userAddress;
		this.bankNo = bankNo;
		this.bankType = bankType;
		this.lastUpdateTime = lastUpdateTime;
		this.lastLoginTime = lastLoginTime;
		this.createTime = createTime;
		this.pictureHead = pictureHead;
	}

	public User() {
		super();
	}

}
