/**
 * 
 */
package com.yantu.service.medioservice;

import com.yantu.pojo.Medio;

/**
 * 2017-9-20下午8:20:10
 * 
 */
public interface MedioService {
	/**
	 * 保存文件(只保存文件的路径)
	 */
	int saveMedio(Medio medio);

	/**
	 * 根据id查询 视频 或者图片
	 */
	Medio selectMedioById(Integer id);
}
