package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 清扫房间
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
@TableName("qingsaofangjian")
public class QingsaofangjianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QingsaofangjianEntity() {
		
	}
	
	public QingsaofangjianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 客房号
	 */
					
	private String kefanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：客房号
	 */
	public void setKefanghao(String kefanghao) {
		this.kefanghao = kefanghao;
	}
	/**
	 * 获取：客房号
	 */
	public String getKefanghao() {
		return kefanghao;
	}
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
