package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QiyexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QiyexinxiView;


/**
 * 企业信息
 *
 * @author 
 * @email 
 * @date 2024-04-30 11:48:02
 */
public interface QiyexinxiService extends IService<QiyexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiyexinxiView> selectListView(Wrapper<QiyexinxiEntity> wrapper);
   	
   	QiyexinxiView selectView(@Param("ew") Wrapper<QiyexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiyexinxiEntity> wrapper);
   	

}

