package com.example.marotimulange.myapplication.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Contact {

    @SerializedName("id")
    @Expose
    private var id: String? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("email")
    @Expose
    private var email: String? = null
    @SerializedName("address")
    @Expose
    private var address: String? = null
    @SerializedName("gender")
    @Expose
    private var gender: String? = null
    @SerializedName("phone")
    @Expose
    private var phone: Phone? = null

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getEmail(): String? {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getAddress(): String? {
        return address
    }

    fun setAddress(address: String) {
        this.address = address
    }

    fun getGender(): String? {
        return gender
    }

    fun setGender(gender: String) {
        this.gender = gender
    }

    fun getPhone(): Phone? {
        return phone
    }

    fun setPhone(phone: Phone) {
        this.phone = phone
    }

}