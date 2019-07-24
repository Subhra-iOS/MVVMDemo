package com.example.mvvmdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//https://proandroiddev.com/mvvm-with-kotlin-android-architecture-components-dagger-2-retrofit-and-rxandroid-1a4ebb38c699

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
