package com.example.demo.entity;

import org.springframework.lang.Nullable;

import javax.persistence.*;

/**
 * Created by xjw on 9/16/18.
 */

@Entity
@Table(name = "matricsQ")
public class MatricsQ {
    @Id
    @GeneratedValue
    @Column(name = "mid")

    private int mid;

    @Column(name = "description")
    @Nullable
    private String description;

    @Column(name = "rowOption1")
    @Nullable
    private String rowOption1;

    @Column(name = "rowOption2")
    @Nullable
    private String rowOption2;

    @Column(name = "rowOption3")
    @Nullable
    private String rowOption3;

    @Column(name = "rowOption4")
    @Nullable
    private String rowOption4;

    @Column(name = "rowOption5")
    @Nullable
    private String rowOption5;

    @Column(name = "rowOption6")
    @Nullable
    private String rowOption6;

    @Column(name = "rowOption7")
    @Nullable
    private String rowOption7;

    @Column(name = "rowOption8")
    @Nullable
    private String rowOption8;

    @Column(name = "rowOption9")
    @Nullable
    private String rowOption9;

    @Column(name = "rowOption10")
    @Nullable
    private String rowOption10;


    @Column(name = "colOption1")
    @Nullable
    private String colOption1;

    @Column(name = "colOption2")
    @Nullable
    private String colOption2;

    @Column(name = "colOption3")
    @Nullable
    private String colOption3;

    @Column(name = "colOption4")
    @Nullable
    private String colOption4;

    @Column(name = "colOption5")
    @Nullable
    private String colOption5;

    @Column(name = "colOption6")
    @Nullable
    private String colOption6;

    @Column(name = "colOption7")
    @Nullable
    private String colOption7;

    @Column(name = "colOption8")
    @Nullable
    private String colOption8;

    @Column(name = "colOption9")
    @Nullable
    private String colOption9;

    @Column(name = "colOption10")
    @Nullable
    private String colOption10;

    public MatricsQ(String description, String rowOption1, String rowOption2, String rowOption3, String rowOption4, String rowOption5, String rowOption6, String rowOption7, String rowOption8, String rowOption9, String rowOption10, String colOption1, String colOption2, String colOption3, String colOption4, String colOption5, String colOption6, String colOption7, String colOption8, String colOption9, String colOption10) {
        this.description = description;
        this.rowOption1 = rowOption1;
        this.rowOption2 = rowOption2;
        this.rowOption3 = rowOption3;
        this.rowOption4 = rowOption4;
        this.rowOption5 = rowOption5;
        this.rowOption6 = rowOption6;
        this.rowOption7 = rowOption7;
        this.rowOption8 = rowOption8;
        this.rowOption9 = rowOption9;
        this.rowOption10 = rowOption10;
        this.colOption1 = colOption1;
        this.colOption2 = colOption2;
        this.colOption3 = colOption3;
        this.colOption4 = colOption4;
        this.colOption5 = colOption5;
        this.colOption6 = colOption6;
        this.colOption7 = colOption7;
        this.colOption8 = colOption8;
        this.colOption9 = colOption9;
        this.colOption10 = colOption10;
    }

    public MatricsQ() {
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int cid) {
        this.mid = cid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRowOption1() {
        return rowOption1;
    }

    public void setRowOption1(String rowOption1) {
        this.rowOption1 = rowOption1;
    }

    public String getRowOption2() {
        return rowOption2;
    }

    public void setRowOption2(String rowOption2) {
        this.rowOption2 = rowOption2;
    }

    public String getRowOption3() {
        return rowOption3;
    }

    public void setRowOption3(String rowOption3) {
        this.rowOption3 = rowOption3;
    }

    public String getRowOption4() {
        return rowOption4;
    }

    public void setRowOption4(String rowOption4) {
        this.rowOption4 = rowOption4;
    }

    public String getRowOption5() {
        return rowOption5;
    }

    public void setRowOption5(String rowOption5) {
        this.rowOption5 = rowOption5;
    }

    public String getRowOption6() {
        return rowOption6;
    }

    public void setRowOption6(String rowOption6) {
        this.rowOption6 = rowOption6;
    }

    public String getRowOption7() {
        return rowOption7;
    }

    public void setRowOption7(String rowOption7) {
        this.rowOption7 = rowOption7;
    }

    public String getRowOption8() {
        return rowOption8;
    }

    public void setRowOption8(String rowOption8) {
        this.rowOption8 = rowOption8;
    }

    public String getRowOption9() {
        return rowOption9;
    }

    public void setRowOption9(String rowOption9) {
        this.rowOption9 = rowOption9;
    }

    public String getRowOption10() {
        return rowOption10;
    }

    public void setRowOption10(String rowOption10) {
        this.rowOption10 = rowOption10;
    }

    public String getColOption1() {
        return colOption1;
    }

    public void setColOption1(String colOption1) {
        this.colOption1 = colOption1;
    }

    public String getColOption2() {
        return colOption2;
    }

    public void setColOption2(String colOption2) {
        this.colOption2 = colOption2;
    }

    public String getColOption3() {
        return colOption3;
    }

    public void setColOption3(String colOption3) {
        this.colOption3 = colOption3;
    }

    public String getColOption4() {
        return colOption4;
    }

    public void setColOption4(String colOption4) {
        this.colOption4 = colOption4;
    }

    public String getColOption5() {
        return colOption5;
    }

    public void setColOption5(String colOption5) {
        this.colOption5 = colOption5;
    }

    public String getColOption6() {
        return colOption6;
    }

    public void setColOption6(String colOption6) {
        this.colOption6 = colOption6;
    }

    public String getColOption7() {
        return colOption7;
    }

    public void setColOption7(String colOption7) {
        this.colOption7 = colOption7;
    }

    public String getColOption8() {
        return colOption8;
    }

    public void setColOption8(String colOption8) {
        this.colOption8 = colOption8;
    }

    public String getColOption9() {
        return colOption9;
    }

    public void setColOption9(String colOption9) {
        this.colOption9 = colOption9;
    }

    public String getColOption10() {
        return colOption10;
    }

    public void setColOption10(String colOption10) {
        this.colOption10 = colOption10;
    }
}
