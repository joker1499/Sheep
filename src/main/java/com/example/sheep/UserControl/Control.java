package com.example.sheep.UserControl;

import com.example.sheep.Domain.Group;
import com.example.sheep.Domain.Sheep;
import com.example.sheep.service.Injection;
import com.example.sheep.service.SheepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

import static java.lang.Thread.sleep;

@Controller
public class Control {
    private List<Sheep> SheepList;
    private List<Sheep> InjectionSheepList;
    @Autowired
    private Group group;

    @Resource
    private SheepService sheepService;

    @GetMapping("/update")
    @ResponseBody
    public void method(){
        SheepList = group.getSheepList();
        InjectionSheepList = group.getInjectSheepList();
    }
//
    @GetMapping("/quit")
    @ResponseBody
    public void method2() throws InterruptedException {
        while (!group.getInjectSheepList().isEmpty()) {
            Injection.injection(group);
            sleep(5000);
        }
    }

}
