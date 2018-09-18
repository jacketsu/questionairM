package com.example.demo.entity;
import javax.persistence.*;
/**
 * Created by xjw on 9/16/18.
 */

@Entity
@Table(name = "qSet")
public class Qset {

    @Id
    @GeneratedValue
    @Column(name = "sid")
    private int sid;

    private int uid;

    private int qid;

    public Qset(int uid, int qid) {
        this.uid = uid;
        this.qid = qid;
    }

    public Qset() {
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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
}
