package com.example.sheep;

import com.example.sheep.Domain.Sheep;
import com.example.sheep.mapper.SheepMapper;
import com.example.sheep.service.SheepService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SheepApplicationTests {

//    @Resource
//    private SheepService sheepService;
    @Resource
    private SheepMapper mapper;
    @Test
    void contextLoads() {
        Sheep sheep = new Sheep();
        sheep.setGrowSpeed(10);
        sheep.setGrowUp(10);
        sheep.setBinary("1010110101");
        sheep.setSheep_name("a10086");
        mapper.insertSelective(sheep);
    }

}
