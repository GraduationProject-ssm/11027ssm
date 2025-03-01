package com.entity.view;

import com.entity.DiscusslizhishipinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 励志视频评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 14:46:26
 */
@TableName("discusslizhishipin")
public class DiscusslizhishipinView  extends DiscusslizhishipinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslizhishipinView(){
	}
 
 	public DiscusslizhishipinView(DiscusslizhishipinEntity discusslizhishipinEntity){
 	try {
			BeanUtils.copyProperties(this, discusslizhishipinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
