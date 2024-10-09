package com.cl.entity;

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
 * 失信信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-30 11:48:03
 */
@TableName("shixinxinxi")
public class ShixinxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShixinxinxiEntity() {
		
	}
	
	public ShixinxinxiEntity(T t) {
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
	 * 企业账号
	 */
					
	private String qiyezhanghao;
	
	/**
	 * 失信被执行人
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 法定代表人
	 */
					
	private String fadingdaibiaoren;
	
	/**
	 * 统一社会信用代码
	 */
					
	private String tongyishehuixinyongdaima;
	
	/**
	 * 登记状态
	 */
					
	private String dengjizhuangtai;
	
	/**
	 * 信用等级
	 */
					
	private String xinyongdengji;
	
	/**
	 * 案号
	 */
					
	private String anhao;
	
	/**
	 * 涉案金额
	 */
					
	private Integer sheanjine;
	
	/**
	 * 执行法院
	 */
					
	private String zhixingfayuan;
	
	/**
	 * 立案日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date lianriqi;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：企业账号
	 */
	public void setQiyezhanghao(String qiyezhanghao) {
		this.qiyezhanghao = qiyezhanghao;
	}
	/**
	 * 获取：企业账号
	 */
	public String getQiyezhanghao() {
		return qiyezhanghao;
	}
	/**
	 * 设置：失信被执行人
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：失信被执行人
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：法定代表人
	 */
	public void setFadingdaibiaoren(String fadingdaibiaoren) {
		this.fadingdaibiaoren = fadingdaibiaoren;
	}
	/**
	 * 获取：法定代表人
	 */
	public String getFadingdaibiaoren() {
		return fadingdaibiaoren;
	}
	/**
	 * 设置：统一社会信用代码
	 */
	public void setTongyishehuixinyongdaima(String tongyishehuixinyongdaima) {
		this.tongyishehuixinyongdaima = tongyishehuixinyongdaima;
	}
	/**
	 * 获取：统一社会信用代码
	 */
	public String getTongyishehuixinyongdaima() {
		return tongyishehuixinyongdaima;
	}
	/**
	 * 设置：登记状态
	 */
	public void setDengjizhuangtai(String dengjizhuangtai) {
		this.dengjizhuangtai = dengjizhuangtai;
	}
	/**
	 * 获取：登记状态
	 */
	public String getDengjizhuangtai() {
		return dengjizhuangtai;
	}
	/**
	 * 设置：信用等级
	 */
	public void setXinyongdengji(String xinyongdengji) {
		this.xinyongdengji = xinyongdengji;
	}
	/**
	 * 获取：信用等级
	 */
	public String getXinyongdengji() {
		return xinyongdengji;
	}
	/**
	 * 设置：案号
	 */
	public void setAnhao(String anhao) {
		this.anhao = anhao;
	}
	/**
	 * 获取：案号
	 */
	public String getAnhao() {
		return anhao;
	}
	/**
	 * 设置：涉案金额
	 */
	public void setSheanjine(Integer sheanjine) {
		this.sheanjine = sheanjine;
	}
	/**
	 * 获取：涉案金额
	 */
	public Integer getSheanjine() {
		return sheanjine;
	}
	/**
	 * 设置：执行法院
	 */
	public void setZhixingfayuan(String zhixingfayuan) {
		this.zhixingfayuan = zhixingfayuan;
	}
	/**
	 * 获取：执行法院
	 */
	public String getZhixingfayuan() {
		return zhixingfayuan;
	}
	/**
	 * 设置：立案日期
	 */
	public void setLianriqi(Date lianriqi) {
		this.lianriqi = lianriqi;
	}
	/**
	 * 获取：立案日期
	 */
	public Date getLianriqi() {
		return lianriqi;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
