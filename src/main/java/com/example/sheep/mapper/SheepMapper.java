package com.example.sheep.mapper;
import org.apache.ibatis.annotations.Param;

import com.example.sheep.Domain.Sheep;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 86152
* @description 针对表【Group】的数据库操作Mapper
* @createDate 2022-11-06 10:19:42
* @Entity com.example.sheep.Domain.Sheep
*/
@Mapper
public interface SheepMapper extends BaseMapper<Sheep> {
    int insertSelective(Sheep sheep);
}




