package com.dao;

import com.entity.QingsaofangjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QingsaofangjianVO;
import com.entity.view.QingsaofangjianView;


/**
 * 清扫房间
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface QingsaofangjianDao extends BaseMapper<QingsaofangjianEntity> {
	
	List<QingsaofangjianVO> selectListVO(@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);
	
	QingsaofangjianVO selectVO(@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);
	
	List<QingsaofangjianView> selectListView(@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);

	List<QingsaofangjianView> selectListView(Pagination page,@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);
	
	QingsaofangjianView selectView(@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);
	
}
