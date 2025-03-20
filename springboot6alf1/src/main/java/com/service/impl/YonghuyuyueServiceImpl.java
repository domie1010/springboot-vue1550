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


import com.dao.YonghuyuyueDao;
import com.entity.YonghuyuyueEntity;
import com.service.YonghuyuyueService;
import com.entity.vo.YonghuyuyueVO;
import com.entity.view.YonghuyuyueView;

@Service("yonghuyuyueService")
public class YonghuyuyueServiceImpl extends ServiceImpl<YonghuyuyueDao, YonghuyuyueEntity> implements YonghuyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuyuyueEntity> page = this.selectPage(
                new Query<YonghuyuyueEntity>(params).getPage(),
                new EntityWrapper<YonghuyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuyuyueEntity> wrapper) {
		  Page<YonghuyuyueView> page =new Query<YonghuyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuyuyueVO> selectListVO(Wrapper<YonghuyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuyuyueVO selectVO(Wrapper<YonghuyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuyuyueView> selectListView(Wrapper<YonghuyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuyuyueView selectView(Wrapper<YonghuyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
