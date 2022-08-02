package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.lang.Integer;

/**
 * ClassName:Sorttype
 * Description: 分类信息实体类
 */
@TableName("Sorttype")
public class Sorttype {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 分类编号
     */
    private Integer id;
    /**
     * 分类名称
     */
    private String sortname;
    /**
     * 分类介绍
     */
    private String sortcontent;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname;
    }

    public String getSortcontent() {
        return sortcontent;
    }

    public void setSortcontent(String sortcontent) {
        this.sortcontent = sortcontent;
    }


}