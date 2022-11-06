package com.example.sheep.service;

import com.example.sheep.Domain.Group;
import com.example.sheep.Domain.Sheep;
import java.util.ArrayList;
import java.util.List;

public class Injection {
    private static ArrayList<Sheep> list = new ArrayList<>();
    public static void injection(Group sheepgroup){
        List<Sheep> Sheep_queue = sheepgroup.getSheepList();
        List<Sheep> Inject_queue = sheepgroup.getInjectSheepList();

        for (Sheep sheep: Sheep_queue) {
            sheep.UpdateGrow();
            System.out.printf(sheep.getGrowUp() + "\n");
            System.out.println(sheep.IsInjection());
            if (sheep.IsInjection()){
                list.add(sheep);
            }
        }
        if (list != null){
            for (Sheep s1: list){
                sheepgroup.setSheep_num(sheepgroup.getSheep_num()-1);
                Inject_queue.add(s1);
                Sheep_queue.remove(s1);
            }
            list.clear();
        }

    }
}
