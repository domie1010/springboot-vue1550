package com.dao;

import com.entity.YonghutuifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghutuifangVO;
import com.entity.view.YonghutuifangView;


/**
 * 用户退房
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface YonghutuifangDao extends BaseMapper<YonghutuifangEntity> {
	
	List<YonghutuifangVO> selectListVO(@Param("ew") Wrapper<YonghutuifangEntity> wrapper);
	
	YonghutuifangVO selectVO(@Param("ew") Wrapper<YonghutuifangEntity> wrapper);
	
	List<YonghutuifangView> selectListView(@Param("ew") Wrapper<YonghutuifangEntity> wrapper);

	List<YonghutuifangView> selectListView(Pagination page,@Param("ew") Wrapper<YonghutuifangEntity> wrapper);
	
	YonghutuifangView selectView(@Param("ew") Wrapper<YonghutuifangEntity> wrapper);
	
}
