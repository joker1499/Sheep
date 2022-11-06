package com.example.sheep.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sheep.Domain.Sheep;
import com.example.sheep.service.SheepService;
import com.example.sheep.mapper.SheepMapper;
import org.springframework.stereotype.Service;

/**
* @author 86152
* @description 针对表【Group】的数据库操作Service实现
* @createDate 2022-11-06 10:19:42
*/
@Service
public class SheepServiceImpl extends ServiceImpl<SheepMapper, Sheep>
    implements SheepService{

}




