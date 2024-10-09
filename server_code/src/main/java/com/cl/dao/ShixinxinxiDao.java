package com.cl.dao;

import com.cl.entity.ShixinxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShixinxinxiView;


/**
 * 失信信息
 * 
 * @author 
 * @email 
 * @date 2024-04-30 11:48:03
 */
public interface ShixinxinxiDao extends BaseMapper<ShixinxinxiEntity> {
	
	List<ShixinxinxiView> selectListView(@Param("ew") Wrapper<ShixinxinxiEntity> wrapper);

	List<ShixinxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixinxinxiEntity> wrapper);
	
	ShixinxinxiView selectView(@Param("ew") Wrapper<ShixinxinxiEntity> wrapper);
	

}
