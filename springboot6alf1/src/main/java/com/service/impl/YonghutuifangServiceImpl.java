package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YonghutuifangDao;
import com.entity.YonghutuifangEntity;
import com.service.YonghutuifangService;
import com.entity.vo.YonghutuifangVO;
import com.entity.view.YonghutuifangView;

@Service("yonghutuifangService")
public class YonghutuifangServiceImpl extends ServiceImpl<YonghutuifangDao, YonghutuifangEntity> implements YonghutuifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghutuifangEntity> page = this.selectPage(
                new Query<YonghutuifangEntity>(params).getPage(),
                new EntityWrapper<YonghutuifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghutuifangEntity> wrapper) {
		  Page<YonghutuifangView> page =new Query<YonghutuifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghutuifangVO> selectListVO(Wrapper<YonghutuifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghutuifangVO selectVO(Wrapper<YonghutuifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghutuifangView> selectListView(Wrapper<YonghutuifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghutuifangView selectView(Wrapper<YonghutuifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
