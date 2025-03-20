package com.entity.view;

import com.entity.YonghuruzhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户入住
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
@TableName("yonghuruzhu")
public class YonghuruzhuView  extends YonghuruzhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuruzhuView(){
	}
 
 	public YonghuruzhuView(YonghuruzhuEntity yonghuruzhuEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuruzhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
