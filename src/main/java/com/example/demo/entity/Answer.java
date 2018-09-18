package com.example.demo.entity;
import javax.persistence.*;
/**
 * Created by xjw on 9/16/18.
 */

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue
    @Column(name = "aid")
    private int aid;

    private int uid;

    private int qid;

    @Column(name = "qType")
    private String qType;

    @Column(name = "content")
    private String content;

    public Answer(int uid, int qid, String qType, String content) {
        this.uid = uid;
        this.qid = qid;
        this.qType = qType;
        this.content = content;
    }

    public Answer() {
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getqType() {
        return qType;
    }

    public void setqType(String qType) {
        this.qType = qType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
