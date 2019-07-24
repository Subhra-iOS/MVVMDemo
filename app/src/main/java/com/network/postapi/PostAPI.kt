/*
* Created by Subhra
* */


package com.network.postapi

import android.database.Observable
import com.service.post.Post
import retrofit2.http.GET

/**
 *The interface which provides methods to get result of webservices
 * @author Subhra Roy
 * */


interface PostApi {

    /*
       Get the list from the API
    */

    @GET("posts")
    fun getPostList() : Observable<List<Post>>
}
