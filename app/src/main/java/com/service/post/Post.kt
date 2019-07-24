/*
* Created by Subhra
* */


package com.service.post

/**
 * Model for Post
 * @constructor set all properties of post
 * @property userId the unique identifier number for user
 * @property id user id
 * @property title Author Title
 * @property body the content of post
 * @author Subhra Roy
 * */

data class Post(val userId: Int, val id: Int, val title: String, val body: String){


}