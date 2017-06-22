package com.example.zga.bean;

import java.io.Serializable;

/**
 * @author z`guo`an on 2017/4/13 15:12
 */

public class UsersBean implements Serializable {
    /**
     * 包含姓名、户主或与户主关系、曾用名、性别、出生地、民族、籍贯、出生日期、本市（县）其他住址、
     * 宗教信仰、身高、血型、文化程度、婚姻状况、兵役状况、服务处所、职业、何时由何地迁来本市（县）
     * 、何时由何地迁来本址、户口登记日期、身份证有效期、身份证发证机关、户口状态、手机号码、流动类型、
     * 流动状态
     */
    private String names = "包含姓名";
    private String sex = "性别";
    private String afternames = "曾用名";
    private String father = "户主或与户主关系";
    private String born = "出生地";
    private String national = "民族";
    private String native_place = "籍贯";
    private String birthday = "出生日期";
    private String other_address = "其他住址";
    private String religious = "宗教信仰";
    private String height = "身高";
    private String blood_type = "血型";
    private String culture = "文化程度";
    private String marital_state = "婚姻状况";
    private String military_service = "兵役状况";
    private String service_space = "服务处所";
    private String professional = "职业";
    private String moved_city = "何时由何地迁来本市";
    private String moved_house = "何时由何地迁来本址";
    private String Household_data = "户口登记日期";
    private String Id_card_data = "身份证有效期";
    private String Id_card_house = "身份证发证机关";
    private String father_state = "户口状态";
    private String phone = "手机号码";
    private String flow_type = "流动类型";
    private String flow_state = "流动状态";


    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAfternames() {
        return afternames;
    }

    public void setAfternames(String afternames) {
        this.afternames = afternames;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getNative_place() {
        return native_place;
    }

    public void setNative_place(String native_place) {
        native_place = native_place;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getOther_address() {
        return other_address;
    }

    public void setOther_address(String other_address) {
        this.other_address = other_address;
    }

    public String getReligious() {
        return religious;
    }

    public void setReligious(String religious) {
        this.religious = religious;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getMarital_state() {
        return marital_state;
    }

    public void setMarital_state(String marital_state) {
        this.marital_state = marital_state;
    }

    public String getMilitary_service() {
        return military_service;
    }

    public void setMilitary_service(String military_service) {
        this.military_service = military_service;
    }

    public String getService_space() {
        return service_space;
    }

    public void setService_space(String service_space) {
        this.service_space = service_space;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    public String getMoved_city() {
        return moved_city;
    }

    public void setMoved_city(String moved_city) {
        this.moved_city = moved_city;
    }

    public String getMoved_house() {
        return moved_house;
    }

    public void setMoved_house(String moved_house) {
        this.moved_house = moved_house;
    }

    public String getHousehold_data() {
        return Household_data;
    }

    public void setHousehold_data(String household_data) {
        Household_data = household_data;
    }

    public String getId_card_data() {
        return Id_card_data;
    }

    public void setId_card_data(String id_card_data) {
        Id_card_data = id_card_data;
    }

    public String getId_card_house() {
        return Id_card_house;
    }

    public void setId_card_house(String id_card_house) {
        Id_card_house = id_card_house;
    }

    public String getFather_state() {
        return father_state;
    }

    public void setFather_state(String father_state) {
        this.father_state = father_state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFlow_type() {
        return flow_type;
    }

    public void setFlow_type(String flow_type) {
        this.flow_type = flow_type;
    }

    public String getFlow_state() {
        return flow_state;
    }

    public void setFlow_state(String flow_state) {
        this.flow_state = flow_state;
    }
}
