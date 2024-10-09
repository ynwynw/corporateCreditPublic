package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShixinxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShixinxinxiView;


/**
 * 失信信息
 *
 * @author 
 * @email 
 * @date 2024-04-30 11:48:03
 */
public interface ShixinxinxiService extends IService<ShixinxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixinxinxiView> selectListView(Wrapper<ShixinxinxiEntity> wrapper);
   	
   	ShixinxinxiView selectView(@Param("ew") Wrapper<ShixinxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixinxinxiEntity> wrapper);
   	

}

