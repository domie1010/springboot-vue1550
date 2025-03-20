package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QingsaofangjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QingsaofangjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QingsaofangjianView;


/**
 * 清扫房间
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface QingsaofangjianService extends IService<QingsaofangjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QingsaofangjianVO> selectListVO(Wrapper<QingsaofangjianEntity> wrapper);
   	
   	QingsaofangjianVO selectVO(@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);
   	
   	List<QingsaofangjianView> selectListView(Wrapper<QingsaofangjianEntity> wrapper);
   	
   	QingsaofangjianView selectView(@Param("ew") Wrapper<QingsaofangjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QingsaofangjianEntity> wrapper);
   	
}

