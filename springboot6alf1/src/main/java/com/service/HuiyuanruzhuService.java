package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanruzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanruzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanruzhuView;


/**
 * 会员入住
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface HuiyuanruzhuService extends IService<HuiyuanruzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanruzhuVO> selectListVO(Wrapper<HuiyuanruzhuEntity> wrapper);
   	
   	HuiyuanruzhuVO selectVO(@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);
   	
   	List<HuiyuanruzhuView> selectListView(Wrapper<HuiyuanruzhuEntity> wrapper);
   	
   	HuiyuanruzhuView selectView(@Param("ew") Wrapper<HuiyuanruzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanruzhuEntity> wrapper);
   	
}

