package com.example.marotimulange.myapplication.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marotimulange.myapplication.R
import com.example.marotimulange.myapplication.pojo.Contact
import kotlinx.android.synthetic.main.row_view_contact.view.*

class ContactAdapter(var contactList: List<Contact>, var context: Context) :
    RecyclerView.Adapter<ContactAdapter.ContactHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ContactHolder {
        return ContactHolder(LayoutInflater.from(context).inflate(R.layout.row_view_contact, parent, false))
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    override fun onBindViewHolder(holder: ContactHolder, position: Int) {
        holder?.tvName?.text = contactList.get(position).getName()
        holder?.tvId?.text = contactList.get(position).getId()
        holder?.tvEmail?.text = contactList.get(position).getEmail()
        holder?.tvGender?.text = contactList.get(position).getGender()
    }

    class ContactHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvName = view.row_view_contact_tv_name
        var tvId = view.row_view_contact_tv_id
        var tvEmail = view.row_view_contact_tv_email
        var tvGender = view.row_view_contact_tv_gender

    }

}