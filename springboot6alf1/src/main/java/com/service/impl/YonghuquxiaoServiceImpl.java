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


import com.dao.YonghuquxiaoDao;
import com.entity.YonghuquxiaoEntity;
import com.service.YonghuquxiaoService;
import com.entity.vo.YonghuquxiaoVO;
import com.entity.view.YonghuquxiaoView;

@Service("yonghuquxiaoService")
public class YonghuquxiaoServiceImpl extends ServiceImpl<YonghuquxiaoDao, YonghuquxiaoEntity> implements YonghuquxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuquxiaoEntity> page = this.selectPage(
                new Query<YonghuquxiaoEntity>(params).getPage(),
                new EntityWrapper<YonghuquxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuquxiaoEntity> wrapper) {
		  Page<YonghuquxiaoView> page =new Query<YonghuquxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuquxiaoVO> selectListVO(Wrapper<YonghuquxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuquxiaoVO selectVO(Wrapper<YonghuquxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuquxiaoView> selectListView(Wrapper<YonghuquxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuquxiaoView selectView(Wrapper<YonghuquxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
