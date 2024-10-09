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


import com.cl.dao.QiyexinxiDao;
import com.cl.entity.QiyexinxiEntity;
import com.cl.service.QiyexinxiService;
import com.cl.entity.view.QiyexinxiView;

@Service("qiyexinxiService")
public class QiyexinxiServiceImpl extends ServiceImpl<QiyexinxiDao, QiyexinxiEntity> implements QiyexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiyexinxiEntity> page = this.selectPage(
                new Query<QiyexinxiEntity>(params).getPage(),
                new EntityWrapper<QiyexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiyexinxiEntity> wrapper) {
		  Page<QiyexinxiView> page =new Query<QiyexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<QiyexinxiView> selectListView(Wrapper<QiyexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiyexinxiView selectView(Wrapper<QiyexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
