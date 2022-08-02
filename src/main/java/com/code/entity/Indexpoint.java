package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.lang.Integer;

/**
 * ClassName:Indexpoint
 * Description: 毕业指标点实体类
 */
@TableName("Indexpoint")
public class Indexpoint {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 指标编号
     */
    private Integer id;
    /**
     * 指标名称
     */
    private String title;
    /**
     * 指标内容
     */
    private String content;
    /**
     * 达成度最小值
     */
    private String rate;
    /**
     * 添加时间
     */
    private String addtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }


}
