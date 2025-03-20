package com.dao;

import com.entity.HuiyuanquxiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanquxiaoVO;
import com.entity.view.HuiyuanquxiaoView;


/**
 * 会员取消
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface HuiyuanquxiaoDao extends BaseMapper<HuiyuanquxiaoEntity> {
	
	List<HuiyuanquxiaoVO> selectListVO(@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);
	
	HuiyuanquxiaoVO selectVO(@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);
	
	List<HuiyuanquxiaoView> selectListView(@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);

	List<HuiyuanquxiaoView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);
	
	HuiyuanquxiaoView selectView(@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);
	
}
