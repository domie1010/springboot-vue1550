package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuantuifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuantuifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuantuifangView;


/**
 * 会员退房
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface HuiyuantuifangService extends IService<HuiyuantuifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuantuifangVO> selectListVO(Wrapper<HuiyuantuifangEntity> wrapper);
   	
   	HuiyuantuifangVO selectVO(@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);
   	
   	List<HuiyuantuifangView> selectListView(Wrapper<HuiyuantuifangEntity> wrapper);
   	
   	HuiyuantuifangView selectView(@Param("ew") Wrapper<HuiyuantuifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuantuifangEntity> wrapper);
   	
}

