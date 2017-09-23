/**
 * 
 */
package com.yantu.dao.medio;

import com.yantu.pojo.Medio;

/**
 * 2017-9-18下午7:16:43
 * 
 * 视频、图片、文件 上传下载dao
 */
public interface MedioMapper {
	/**
	 * 保存文件(只保存文件的路径)
	 */
	int saveMedio(Medio medio);

	/**
	 * 根据id查询 视频 或者图片
	 */
	Medio selectMedioById(Integer id);
}
