package com.dao;

import com.entity.HuiyuanruzhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanruzhuVO;
import com.entity.view.HuiyuanruzhuView;


/**
 * 会员入住
 * 
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface HuiyuanruzhuDao extends BaseMapper<HuiyuanruzhuEntity> {
	
	List<HuiyuanruzhuVO> selectListVO(@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);
	
	HuiyuanruzhuVO selectVO(@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);
	
	List<HuiyuanruzhuView> selectListView(@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);

	List<HuiyuanruzhuView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);
	
	HuiyuanruzhuView selectView(@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);
	
}
