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
 * 企业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-30 11:48:02
 */
@TableName("qiye")
public class QiyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiyeEntity() {
		
	}
	
	public QiyeEntity(T t) {
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
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 法定代表人
	 */
					
	private String fadingdaibiaoren;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 注册资金
	 */
					
	private Double zhucezijin;
	
	/**
	 * 成立日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date chengliriqi;
	
	/**
	 * 统一社会信用代码
	 */
					
	private String tongyishehuixinyongdaima;
	
	/**
	 * 机关所在地
	 */
					
	private String jiguansuozaidi;
	
	/**
	 * 企业类型
	 */
					
	private String qiyeleixing;
	
	/**
	 * 所属行业
	 */
					
	private String suoshuxingye;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
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
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：注册资金
	 */
	public void setZhucezijin(Double zhucezijin) {
		this.zhucezijin = zhucezijin;
	}
	/**
	 * 获取：注册资金
	 */
	public Double getZhucezijin() {
		return zhucezijin;
	}
	/**
	 * 设置：成立日期
	 */
	public void setChengliriqi(Date chengliriqi) {
		this.chengliriqi = chengliriqi;
	}
	/**
	 * 获取：成立日期
	 */
	public Date getChengliriqi() {
		return chengliriqi;
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
	 * 设置：机关所在地
	 */
	public void setJiguansuozaidi(String jiguansuozaidi) {
		this.jiguansuozaidi = jiguansuozaidi;
	}
	/**
	 * 获取：机关所在地
	 */
	public String getJiguansuozaidi() {
		return jiguansuozaidi;
	}
	/**
	 * 设置：企业类型
	 */
	public void setQiyeleixing(String qiyeleixing) {
		this.qiyeleixing = qiyeleixing;
	}
	/**
	 * 获取：企业类型
	 */
	public String getQiyeleixing() {
		return qiyeleixing;
	}
	/**
	 * 设置：所属行业
	 */
	public void setSuoshuxingye(String suoshuxingye) {
		this.suoshuxingye = suoshuxingye;
	}
	/**
	 * 获取：所属行业
	 */
	public String getSuoshuxingye() {
		return suoshuxingye;
	}

}
