package com.cq.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 作者:传奇
 * 包名:com.cq.model
 * 创建时间:2019/7/19 10:37
 */
public class LogInfo implements Serializable {
    public LogInfo(Integer id, Date createTime, String content) {
        this.id = id;
        this.createTime = createTime;
        this.content = content;
    }

    private Integer id;
    private Date createTime;
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
