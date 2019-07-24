
/*
* Created by Subhra
* */

package com.ui.post

import com.base.BaseViewModel
import com.network.postapi.PostApi
import javax.inject.Inject

class PostListViewModel : BaseViewModel() {

    @Inject
    lateinit var postApi : PostApi
}