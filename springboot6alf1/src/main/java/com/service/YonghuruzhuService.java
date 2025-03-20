package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuruzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuruzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuruzhuView;


/**
 * 用户入住
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface YonghuruzhuService extends IService<YonghuruzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuruzhuVO> selectListVO(Wrapper<YonghuruzhuEntity> wrapper);
   	
   	YonghuruzhuVO selectVO(@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);
   	
   	List<YonghuruzhuView> selectListView(Wrapper<YonghuruzhuEntity> wrapper);
   	
   	YonghuruzhuView selectView(@Param("ew") Wrapper<YonghuruzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuruzhuEntity> wrapper);
   	
}

