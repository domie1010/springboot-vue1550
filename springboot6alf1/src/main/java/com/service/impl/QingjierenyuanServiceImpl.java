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


import com.dao.QingjierenyuanDao;
import com.entity.QingjierenyuanEntity;
import com.service.QingjierenyuanService;
import com.entity.vo.QingjierenyuanVO;
import com.entity.view.QingjierenyuanView;

@Service("qingjierenyuanService")
public class QingjierenyuanServiceImpl extends ServiceImpl<QingjierenyuanDao, QingjierenyuanEntity> implements QingjierenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QingjierenyuanEntity> page = this.selectPage(
                new Query<QingjierenyuanEntity>(params).getPage(),
                new EntityWrapper<QingjierenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QingjierenyuanEntity> wrapper) {
		  Page<QingjierenyuanView> page =new Query<QingjierenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QingjierenyuanVO> selectListVO(Wrapper<QingjierenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QingjierenyuanVO selectVO(Wrapper<QingjierenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QingjierenyuanView> selectListView(Wrapper<QingjierenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QingjierenyuanView selectView(Wrapper<QingjierenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
