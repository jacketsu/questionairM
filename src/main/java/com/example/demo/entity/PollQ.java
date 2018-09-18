package com.example.demo.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

/**
 * Created by xjw on 9/16/18.
 */

@Entity
@Table(name = "pollQ")
public class PollQ {

    @Id
    @GeneratedValue
    @Column(name = "pid")
    private int pid;

    @Column(name = "description")
    private String description;

    @Column(name = "option1")
    @Nullable
    private String option1;

    @Column(name = "option2")
    @Nullable
    private String option2;

    @Column(name = "option3")
    @Nullable
    private String option3;

    @Column(name = "option4")
    @Nullable
    private String option4;

    @Column(name = "option5")
    @Nullable
    private String option5;

    @Column(name = "option6")
    @Nullable
    private String option6;

    @Column(name = "option7")
    @Nullable
    private String option7;

    @Column(name = "option8")
    @Nullable
    private String option8;

    @Column(name = "option9")
    @Nullable
    private String option9;

    @Column(name = "option10")
    @Nullable
    private String option10;

    public PollQ(String description, String option1, String option2, String option3, String option4, String option5, String option6, String option7, String option8, String option9, String option10) {
        this.description = description;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.option5 = option5;
        this.option6 = option6;
        this.option7 = option7;
        this.option8 = option8;
        this.option9 = option9;
        this.option10 = option10;
    }

    public PollQ() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public String getOption5() {
        return option5;
    }

    public void setOption5(String option5) {
        this.option5 = option5;
    }

    public String getOption6() {
        return option6;
    }

    public void setOption6(String option6) {
        this.option6 = option6;
    }

    public String getOption7() {
        return option7;
    }

    public void setOption7(String option7) {
        this.option7 = option7;
    }

    public String getOption8() {
        return option8;
    }

    public void setOption8(String option8) {
        this.option8 = option8;
    }

    public String getOption9() {
        return option9;
    }

    public void setOption9(String option9) {
        this.option9 = option9;
    }

    public String getOption10() {
        return option10;
    }

    public void setOption10(String option10) {
        this.option10 = option10;
    }
}
