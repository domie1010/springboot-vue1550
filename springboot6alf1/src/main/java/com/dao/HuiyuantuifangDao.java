package com.dao;

import com.entity.HuiyuantuifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuantuifangVO;
import com.entity.view.HuiyuantuifangView;


/**
 * 会员退房
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface HuiyuantuifangDao extends BaseMapper<HuiyuantuifangEntity> {
	
	List<HuiyuantuifangVO> selectListVO(@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);
	
	HuiyuantuifangVO selectVO(@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);
	
	List<HuiyuantuifangView> selectListView(@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);

	List<HuiyuantuifangView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);
	
	HuiyuantuifangView selectView(@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);
	
}
