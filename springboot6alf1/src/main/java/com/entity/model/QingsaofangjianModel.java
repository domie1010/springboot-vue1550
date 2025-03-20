package com.entity.model;

import com.entity.QingsaofangjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 清扫房间
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public class QingsaofangjianModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 所属酒店
	 */
	
	private String suoshujiudian;
		
	/**
	 * 是否打扫
	 */
	
	private String shifoudasao;
		
	/**
	 * 打扫时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dasaoshijian;
		
	/**
	 * 清洁账号
	 */
	
	private String qingjiezhanghao;
		
	/**
	 * 清洁姓名
	 */
	
	private String qingjiexingming;
				
	
	/**
	 * 设置：客房类型
	 */
	 
	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}
	
	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}
				
	
	/**
	 * 设置：所属酒店
	 */
	 
	public void setSuoshujiudian(String suoshujiudian) {
		this.suoshujiudian = suoshujiudian;
	}
	
	/**
	 * 获取：所属酒店
	 */
	public String getSuoshujiudian() {
		return suoshujiudian;
	}
				
	
	/**
	 * 设置：是否打扫
	 */
	 
	public void setShifoudasao(String shifoudasao) {
		this.shifoudasao = shifoudasao;
	}
	
	/**
	 * 获取：是否打扫
	 */
	public String getShifoudasao() {
		return shifoudasao;
	}
				
	
	/**
	 * 设置：打扫时间
	 */
	 
	public void setDasaoshijian(Date dasaoshijian) {
		this.dasaoshijian = dasaoshijian;
	}
	
	/**
	 * 获取：打扫时间
	 */
	public Date getDasaoshijian() {
		return dasaoshijian;
	}
				
	
	/**
	 * 设置：清洁账号
	 */
	 
	public void setQingjiezhanghao(String qingjiezhanghao) {
		this.qingjiezhanghao = qingjiezhanghao;
	}
	
	/**
	 * 获取：清洁账号
	 */
	public String getQingjiezhanghao() {
		return qingjiezhanghao;
	}
				
	
	/**
	 * 设置：清洁姓名
	 */
	 
	public void setQingjiexingming(String qingjiexingming) {
		this.qingjiexingming = qingjiexingming;
	}
	
	/**
	 * 获取：清洁姓名
	 */
	public String getQingjiexingming() {
		return qingjiexingming;
	}
			
}
