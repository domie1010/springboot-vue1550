package com.dao;

import com.entity.QingjierenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingjierenyuanVO;
import com.entity.view.QingjierenyuanView;


/**
 * 清洁人员
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:54
 */
public interface QingjierenyuanDao extends BaseMapper<QingjierenyuanEntity> {
	
	List<QingjierenyuanVO> selectListVO(@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);
	
	QingjierenyuanVO selectVO(@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);
	
	List<QingjierenyuanView> selectListView(@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);

	List<QingjierenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);
	
	QingjierenyuanView selectView(@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);
	
}
