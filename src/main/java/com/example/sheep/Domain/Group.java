package com.example.sheep.Domain;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @TableName Group
 */
@Component
public class Group implements Serializable {

    public Group(){
        GenerateSheepGroup();
    }

    private List<Sheep> SheepGroup= new LinkedList<>();

    private List<Sheep> InjectSheepGroup= new LinkedList<>();

    private int Sheep_num;

    public int getSheep_num() {
        return Sheep_num;
    }

    public void setSheep_num(int sheep_num) {
        Sheep_num = sheep_num;
    }

    public List<Sheep> getSheepList() {
        return SheepGroup;
    }

    public List<Sheep> getInjectSheepList() {
        return InjectSheepGroup;
    }

    private void GenerateSheepGroup(){

        for (int i=0;i<100;i++){
            Sheep sheep = new Sheep();
            sheep.setSheep_name(RandomLetter.Letter() + RandomLetter.Number(i));
            sheep.setBinary(RandomLetter.toBinary(sheep.getSheep_name()));
            sheep.setGrowUp(RandomLetter.GenerateGrowUp());
            sheep.setGrowSpeed(RandomLetter.GenerateGrowSpeed());
            SheepGroup.add(sheep);
        }
    }
}