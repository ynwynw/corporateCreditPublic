package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.ShixinxinxiDao;
import com.cl.entity.ShixinxinxiEntity;
import com.cl.service.ShixinxinxiService;
import com.cl.entity.view.ShixinxinxiView;

@Service("shixinxinxiService")
public class ShixinxinxiServiceImpl extends ServiceImpl<ShixinxinxiDao, ShixinxinxiEntity> implements ShixinxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixinxinxiEntity> page = this.selectPage(
                new Query<ShixinxinxiEntity>(params).getPage(),
                new EntityWrapper<ShixinxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixinxinxiEntity> wrapper) {
		  Page<ShixinxinxiView> page =new Query<ShixinxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ShixinxinxiView> selectListView(Wrapper<ShixinxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixinxinxiView selectView(Wrapper<ShixinxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
