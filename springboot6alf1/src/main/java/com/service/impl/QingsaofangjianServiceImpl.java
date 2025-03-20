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


import com.dao.QingsaofangjianDao;
import com.entity.QingsaofangjianEntity;
import com.service.QingsaofangjianService;
import com.entity.vo.QingsaofangjianVO;
import com.entity.view.QingsaofangjianView;

@Service("qingsaofangjianService")
public class QingsaofangjianServiceImpl extends ServiceImpl<QingsaofangjianDao, QingsaofangjianEntity> implements QingsaofangjianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingsaofangjianEntity> page = this.selectPage(
                new Query<QingsaofangjianEntity>(params).getPage(),
                new EntityWrapper<QingsaofangjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingsaofangjianEntity> wrapper) {
		  Page<QingsaofangjianView> page =new Query<QingsaofangjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingsaofangjianVO> selectListVO(Wrapper<QingsaofangjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingsaofangjianVO selectVO(Wrapper<QingsaofangjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingsaofangjianView> selectListView(Wrapper<QingsaofangjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingsaofangjianView selectView(Wrapper<QingsaofangjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
