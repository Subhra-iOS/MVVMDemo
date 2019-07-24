package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val model : BaseViewModel = ViewModelProvider.of(this)[BaseViewModel :: class.java]

        model.getUserList().observe(this, Observer<List<UserModel>> { users ->

            //Update UI
            print("List : $users")
        })*/
    }
}
