package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuquxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuquxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuquxiaoView;


/**
 * 用户取消
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface YonghuquxiaoService extends IService<YonghuquxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuquxiaoVO> selectListVO(Wrapper<YonghuquxiaoEntity> wrapper);
   	
   	YonghuquxiaoVO selectVO(@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);
   	
   	List<YonghuquxiaoView> selectListView(Wrapper<YonghuquxiaoEntity> wrapper);
   	
   	YonghuquxiaoView selectView(@Param("ew") Wrapper<YonghuquxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuquxiaoEntity> wrapper);
   	
}

