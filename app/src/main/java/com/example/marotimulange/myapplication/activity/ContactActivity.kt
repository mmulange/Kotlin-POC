package com.example.marotimulange.myapplication.activity

import android.app.ProgressDialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.example.marotimulange.myapplication.R
import com.example.marotimulange.myapplication.adapter.ContactAdapter
import com.example.marotimulange.myapplication.pojo.Contact
import com.example.marotimulange.myapplication.pojo.ContactFeeds
import com.example.marotimulange.myapplication.retrofit.APIClient
import com.example.marotimulange.myapplication.retrofit.APIInterface
import org.jetbrains.anko.indeterminateProgressDialog
import retrofit2.Call
import retrofit2.Callback

class ContactActivity : AppCompatActivity() {

    private val TAG: String? = javaClass.simpleName

    private var rvContactList: RecyclerView? = null

    private var contactList: List<Contact>? = null

    private var pd: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        initView()
    }

    fun initView() {

        rvContactList = findViewById(R.id.activity_contact_rv)

        pd = indeterminateProgressDialog("Fetching Data", "Demo App123")
        pd!!.show()

        getFeedList()

        // Creates a vertical Layout Manager
        rvContactList!!.layoutManager = LinearLayoutManager(this)

    }

    fun getFeedList() {


        /** Create handle for the RetrofitInstance interface */
        val apiInterface = APIClient.getClient().create(APIInterface::class.java)

        /** Call the method with parameter in the interface to get the feeds data */
        val call = apiInterface.getFeeds()

        /**Log the URL called */
        Log.d(TAG, "URL Called " + call.request().url() + "");

        call.enqueue(object : Callback<ContactFeeds> {
            override fun onResponse(call: Call<ContactFeeds>, response: retrofit2.Response<ContactFeeds>) {
                if (response.isSuccessful()) {

                    contactList = response.body()!!.getContacts()

                    Log.d(TAG, "Total contacts available " + contactList!!.size);
                    pd!!.dismiss()

                    // Access the RecyclerView Adapter and load the data into it
                    rvContactList!!.adapter = ContactAdapter(contactList!!, this@ContactActivity)

                }
            }

            override fun onFailure(call: Call<ContactFeeds>, t: Throwable) {

            }
        })
    }
}