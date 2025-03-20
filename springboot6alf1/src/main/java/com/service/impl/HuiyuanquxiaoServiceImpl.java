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


import com.dao.HuiyuanquxiaoDao;
import com.entity.HuiyuanquxiaoEntity;
import com.service.HuiyuanquxiaoService;
import com.entity.vo.HuiyuanquxiaoVO;
import com.entity.view.HuiyuanquxiaoView;

@Service("huiyuanquxiaoService")
public class HuiyuanquxiaoServiceImpl extends ServiceImpl<HuiyuanquxiaoDao, HuiyuanquxiaoEntity> implements HuiyuanquxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanquxiaoEntity> page = this.selectPage(
                new Query<HuiyuanquxiaoEntity>(params).getPage(),
                new EntityWrapper<HuiyuanquxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanquxiaoEntity> wrapper) {
		  Page<HuiyuanquxiaoView> page =new Query<HuiyuanquxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanquxiaoVO> selectListVO(Wrapper<HuiyuanquxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanquxiaoVO selectVO(Wrapper<HuiyuanquxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanquxiaoView> selectListView(Wrapper<HuiyuanquxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanquxiaoView selectView(Wrapper<HuiyuanquxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
