package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghutuifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghutuifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghutuifangView;


/**
 * 用户退房
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface YonghutuifangService extends IService<YonghutuifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghutuifangVO> selectListVO(Wrapper<YonghutuifangEntity> wrapper);
   	
   	YonghutuifangVO selectVO(@Param("ew") Wrapper<YonghutuifangEntity> wrapper);
   	
   	List<YonghutuifangView> selectListView(Wrapper<YonghutuifangEntity> wrapper);
   	
   	YonghutuifangView selectView(@Param("ew") Wrapper<YonghutuifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghutuifangEntity> wrapper);
   	
}

