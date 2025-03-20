package com.entity.model;

import com.entity.KefangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 客房信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-30 10:31:54
 */
public class KefangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客房类型
	 */
	
	private String kefangleixing;
		
	/**
	 * 床型
	 */
	
	private String chuangxing;
		
	/**
	 * 客房图片
	 */
	
	private String kefangtupian;
		
	/**
	 * 房间面积
	 */
	
	private String fangjianmianji;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 客房状态
	 */
	
	private String kefangzhuangtai;
		
	/**
	 * 可约时间
	 */
	
	private String keyueshijian;
		
	/**
	 * 卫生情况
	 */
	
	private String weishengqingkuang;
		
	/**
	 * 客房环境
	 */
	
	private String kefanghuanjing;
		
	/**
	 * 所属酒店
	 */
	
	private String suoshujiudian;
		
	/**
	 * 客房介绍
	 */
	
	private String kefangjieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
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
	 * 设置：床型
	 */
	 
	public void setChuangxing(String chuangxing) {
		this.chuangxing = chuangxing;
	}
	
	/**
	 * 获取：床型
	 */
	public String getChuangxing() {
		return chuangxing;
	}
				
	
	/**
	 * 设置：客房图片
	 */
	 
	public void setKefangtupian(String kefangtupian) {
		this.kefangtupian = kefangtupian;
	}
	
	/**
	 * 获取：客房图片
	 */
	public String getKefangtupian() {
		return kefangtupian;
	}
				
	
	/**
	 * 设置：房间面积
	 */
	 
	public void setFangjianmianji(String fangjianmianji) {
		this.fangjianmianji = fangjianmianji;
	}
	
	/**
	 * 获取：房间面积
	 */
	public String getFangjianmianji() {
		return fangjianmianji;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：客房状态
	 */
	 
	public void setKefangzhuangtai(String kefangzhuangtai) {
		this.kefangzhuangtai = kefangzhuangtai;
	}
	
	/**
	 * 获取：客房状态
	 */
	public String getKefangzhuangtai() {
		return kefangzhuangtai;
	}
				
	
	/**
	 * 设置：可约时间
	 */
	 
	public void setKeyueshijian(String keyueshijian) {
		this.keyueshijian = keyueshijian;
	}
	
	/**
	 * 获取：可约时间
	 */
	public String getKeyueshijian() {
		return keyueshijian;
	}
				
	
	/**
	 * 设置：卫生情况
	 */
	 
	public void setWeishengqingkuang(String weishengqingkuang) {
		this.weishengqingkuang = weishengqingkuang;
	}
	
	/**
	 * 获取：卫生情况
	 */
	public String getWeishengqingkuang() {
		return weishengqingkuang;
	}
				
	
	/**
	 * 设置：客房环境
	 */
	 
	public void setKefanghuanjing(String kefanghuanjing) {
		this.kefanghuanjing = kefanghuanjing;
	}
	
	/**
	 * 获取：客房环境
	 */
	public String getKefanghuanjing() {
		return kefanghuanjing;
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
	 * 设置：客房介绍
	 */
	 
	public void setKefangjieshao(String kefangjieshao) {
		this.kefangjieshao = kefangjieshao;
	}
	
	/**
	 * 获取：客房介绍
	 */
	public String getKefangjieshao() {
		return kefangjieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
