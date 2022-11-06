package com.example.sheep.Domain;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
@TableName(value ="Group")
public class Sheep implements Serializable {
    /**
     * 
     */
    @TableField("sheep_name")
    private String sheep_name;

    /**
     * 
     */
    @TableField("binary")
    private String binary;

    /**
     * 
     */
    @TableField("grow_up")
    private Integer growUp;

    /**
     * 
     */
    @TableField("grow_speed")
    private Integer growSpeed;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public String getSheep_name() {
        return sheep_name;
    }

    public void setSheep_name(String sheep_name) {
        this.sheep_name = sheep_name;
    }

    /**
     * 
     */
    public String getBinary() {
        return binary;
    }

    /**
     * 
     */
    public void setBinary(String binary) {
        this.binary = binary;
    }

    /**
     * 
     */
    public Integer getGrowUp() {
        return growUp;
    }

    /**
     * 
     */
    public void setGrowUp(Integer growUp) {
        this.growUp = growUp;
    }

    /**
     * 
     */
    public Integer getGrowSpeed() {
        return growSpeed;
    }

    /**
     * 
     */
    public void setGrowSpeed(Integer growSpeed) {
        this.growSpeed = growSpeed;
    }

    public void UpdateGrow(){
        growUp = growUp + growSpeed;
    }

    public boolean IsInjection(){
        return growUp >= 100;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Sheep other = (Sheep) that;
        return (this.getSheep_name() == null ? other.getSheep_name() == null : this.getSheep_name().equals(other.getSheep_name()))
            && (this.getBinary() == null ? other.getBinary() == null : this.getBinary().equals(other.getBinary()))
            && (this.getGrowUp() == null ? other.getGrowUp() == null : this.getGrowUp().equals(other.getGrowUp()))
            && (this.getGrowSpeed() == null ? other.getGrowSpeed() == null : this.getGrowSpeed().equals(other.getGrowSpeed()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSheep_name() == null) ? 0 : getSheep_name().hashCode());
        result = prime * result + ((getBinary() == null) ? 0 : getBinary().hashCode());
        result = prime * result + ((getGrowUp() == null) ? 0 : getGrowUp().hashCode());
        result = prime * result + ((getGrowSpeed() == null) ? 0 : getGrowSpeed().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [" +
                "Hash = " + hashCode() +
                ", name=" + sheep_name +
                ", binary=" + binary +
                ", growUp=" + growUp +
                ", growSpeed=" + growSpeed +
                ", serialVersionUID=" + serialVersionUID +
                "]";
    }
}