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


import com.dao.HuiyuantuifangDao;
import com.entity.HuiyuantuifangEntity;
import com.service.HuiyuantuifangService;
import com.entity.vo.HuiyuantuifangVO;
import com.entity.view.HuiyuantuifangView;

@Service("huiyuantuifangService")
public class HuiyuantuifangServiceImpl extends ServiceImpl<HuiyuantuifangDao, HuiyuantuifangEntity> implements HuiyuantuifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuantuifangEntity> page = this.selectPage(
                new Query<HuiyuantuifangEntity>(params).getPage(),
                new EntityWrapper<HuiyuantuifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuantuifangEntity> wrapper) {
		  Page<HuiyuantuifangView> page =new Query<HuiyuantuifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuantuifangVO> selectListVO(Wrapper<HuiyuantuifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuantuifangVO selectVO(Wrapper<HuiyuantuifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuantuifangView> selectListView(Wrapper<HuiyuantuifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuantuifangView selectView(Wrapper<HuiyuantuifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
