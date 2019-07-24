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

    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}
