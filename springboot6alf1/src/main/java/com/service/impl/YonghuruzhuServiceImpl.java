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


import com.dao.YonghuruzhuDao;
import com.entity.YonghuruzhuEntity;
import com.service.YonghuruzhuService;
import com.entity.vo.YonghuruzhuVO;
import com.entity.view.YonghuruzhuView;

@Service("yonghuruzhuService")
public class YonghuruzhuServiceImpl extends ServiceImpl<YonghuruzhuDao, YonghuruzhuEntity> implements YonghuruzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuruzhuEntity> page = this.selectPage(
                new Query<YonghuruzhuEntity>(params).getPage(),
                new EntityWrapper<YonghuruzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuruzhuEntity> wrapper) {
		  Page<YonghuruzhuView> page =new Query<YonghuruzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuruzhuVO> selectListVO(Wrapper<YonghuruzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuruzhuVO selectVO(Wrapper<YonghuruzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuruzhuView> selectListView(Wrapper<YonghuruzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuruzhuView selectView(Wrapper<YonghuruzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
