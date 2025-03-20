package com.dao;

import com.entity.YonghuquxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuquxiaoVO;
import com.entity.view.YonghuquxiaoView;


/**
 * 用户取消
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface YonghuquxiaoDao extends BaseMapper<YonghuquxiaoEntity> {
	
	List<YonghuquxiaoVO> selectListVO(@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);
	
	YonghuquxiaoVO selectVO(@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);
	
	List<YonghuquxiaoView> selectListView(@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);

	List<YonghuquxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);
	
	YonghuquxiaoView selectView(@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);
	
}
