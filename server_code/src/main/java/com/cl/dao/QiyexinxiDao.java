package com.cl.dao;

import com.cl.entity.QiyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QiyexinxiView;


/**
 * 企业信息
 * 
 * @author 
 * @email 
 * @date 2024-04-30 11:48:02
 */
public interface QiyexinxiDao extends BaseMapper<QiyexinxiEntity> {
	
	List<QiyexinxiView> selectListView(@Param("ew") Wrapper<QiyexinxiEntity> wrapper);

	List<QiyexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiyexinxiEntity> wrapper);
	
	QiyexinxiView selectView(@Param("ew") Wrapper<QiyexinxiEntity> wrapper);
	

}
