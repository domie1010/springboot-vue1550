package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingjierenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingjierenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjierenyuanView;


/**
 * 清洁人员
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:54
 */
public interface QingjierenyuanService extends IService<QingjierenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingjierenyuanVO> selectListVO(Wrapper<QingjierenyuanEntity> wrapper);
   	
   	QingjierenyuanVO selectVO(@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);
   	
   	List<QingjierenyuanView> selectListView(Wrapper<QingjierenyuanEntity> wrapper);
   	
   	QingjierenyuanView selectView(@Param("ew") Wrapper<QingjierenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingjierenyuanEntity> wrapper);
   	
}

