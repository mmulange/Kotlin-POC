package com.example.marotimulange.myapplication.pojo

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class ContactFeeds {

    @SerializedName("contacts")
    @Expose
    private var contacts: List<Contact>? = null

    fun getContacts(): List<Contact>? {
        return contacts
    }

    fun setContacts(contacts: List<Contact>) {
        this.contacts = contacts
    }

}