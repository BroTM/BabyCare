package com.example.dell.babycare.Activities.developmentActivities.model;

/**
 * Created by Aspire on 1/23/2018.
 */

public class PhotoModel {
    String image;
    int childkey;
    String tablename;

    public int getChildkey() {
        return childkey;
    }

    public void setChildkey(int childkey) {
        this.childkey = childkey;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
