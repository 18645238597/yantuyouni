/**
 * 
 */
package com.yantu.pojo;

import java.util.Date;

/**
 * 2017-9-18下午8:39:59
 * 
 * 文件的实体类
 */
public class Medio {
	private Integer userId;// 用户id
	private String videoUrl;// 视频保存的路径
	private String cutPicUrl;// 保存视频截图的路径
	private String imageUrl;// 图片保存的路径
	private Date createDate;// 上传时间

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCutPicUrl() {
		return cutPicUrl;
	}

	public void setCutPicUrl(String cutPicUrl) {
		this.cutPicUrl = cutPicUrl;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Medio(Integer userId, String videoUrl, String cutPicUrl,
			String imageUrl, Date createDate) {
		super();
		this.userId = userId;
		this.videoUrl = videoUrl;
		this.cutPicUrl = cutPicUrl;
		this.imageUrl = imageUrl;
		this.createDate = createDate;
	}

	public Medio() {
		super();
	}

}
