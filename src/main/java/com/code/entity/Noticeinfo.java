package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * ClassName:Noticeinfo
 * Description: 毕业要求信息实体类
 */
@TableName("Noticeinfo")
public class Noticeinfo {

    /**
     * 毕业要求编号
     */
    @TableId(value = "noticeid", type = IdType.AUTO) //主键自增
    private Integer noticeid;
    /**
     * 毕业要求标题
     */
    private String noticetitle;
    /**
     * 毕业要求内容
     */
    private String noticecontent;
    /**
     * 发布时间
     */
    private String noticeaddtime;
    /**
     * 毕业要求备注
     */
    private String noticeremarker;


    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle;
    }

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent;
    }

    public String getNoticeaddtime() {
        return noticeaddtime;
    }

    public void setNoticeaddtime(String noticeaddtime) {
        this.noticeaddtime = noticeaddtime;
    }

    public String getNoticeremarker() {
        return noticeremarker;
    }

    public void setNoticeremarker(String noticeremarker) {
        this.noticeremarker = noticeremarker;
    }


}
