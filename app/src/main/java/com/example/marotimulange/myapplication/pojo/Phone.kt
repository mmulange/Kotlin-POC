package com.example.marotimulange.myapplication.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Phone {

    @SerializedName("mobile")
    @Expose
    private var mobile: String? = null
    @SerializedName("home")
    @Expose
    private var home: String? = null
    @SerializedName("office")
    @Expose
    private var office: String? = null

    fun getMobile(): String? {
        return mobile
    }

    fun setMobile(mobile: String) {
        this.mobile = mobile
    }

    fun getHome(): String? {
        return home
    }

    fun setHome(home: String) {
        this.home = home
    }

    fun getOffice(): String? {
        return office
    }

    fun setOffice(office: String) {
        this.office = office
    }
}