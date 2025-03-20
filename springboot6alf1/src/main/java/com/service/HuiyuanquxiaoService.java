package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanquxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanquxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanquxiaoView;


/**
 * 会员取消
 *
 * @author 
 * @email 
 * @date 2021-04-30 10:31:55
 */
public interface HuiyuanquxiaoService extends IService<HuiyuanquxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanquxiaoVO> selectListVO(Wrapper<HuiyuanquxiaoEntity> wrapper);
   	
   	HuiyuanquxiaoVO selectVO(@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);
   	
   	List<HuiyuanquxiaoView> selectListView(Wrapper<HuiyuanquxiaoEntity> wrapper);
   	
   	HuiyuanquxiaoView selectView(@Param("ew") Wrapper<HuiyuanquxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanquxiaoEntity> wrapper);
   	
}

