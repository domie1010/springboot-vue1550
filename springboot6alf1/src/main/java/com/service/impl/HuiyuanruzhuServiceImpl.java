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


import com.dao.HuiyuanruzhuDao;
import com.entity.HuiyuanruzhuEntity;
import com.service.HuiyuanruzhuService;
import com.entity.vo.HuiyuanruzhuVO;
import com.entity.view.HuiyuanruzhuView;

@Service("huiyuanruzhuService")
public class HuiyuanruzhuServiceImpl extends ServiceImpl<HuiyuanruzhuDao, HuiyuanruzhuEntity> implements HuiyuanruzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanruzhuEntity> page = this.selectPage(
                new Query<HuiyuanruzhuEntity>(params).getPage(),
                new EntityWrapper<HuiyuanruzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanruzhuEntity> wrapper) {
		  Page<HuiyuanruzhuView> page =new Query<HuiyuanruzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanruzhuVO> selectListVO(Wrapper<HuiyuanruzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanruzhuVO selectVO(Wrapper<HuiyuanruzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanruzhuView> selectListView(Wrapper<HuiyuanruzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanruzhuView selectView(Wrapper<HuiyuanruzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
