package com.dao;

import com.entity.YonghuruzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuruzhuVO;
import com.entity.view.YonghuruzhuView;


/**
 * 用户入住
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface YonghuruzhuDao extends BaseMapper<YonghuruzhuEntity> {
	
	List<YonghuruzhuVO> selectListVO(@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);
	
	YonghuruzhuVO selectVO(@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);
	
	List<YonghuruzhuView> selectListView(@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);

	List<YonghuruzhuView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);
	
	YonghuruzhuView selectView(@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);
	
}
