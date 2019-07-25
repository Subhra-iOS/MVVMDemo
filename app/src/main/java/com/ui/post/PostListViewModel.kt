
/*
* Created by Subhra
* */

package com.ui.post

import android.view.View
import android.database.Observable
import com.base.BaseViewModel
import com.network.postapi.PostApi
import dagger.Module
import io.reactivex.Scheduler
import javax.inject.Inject
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.android.schedulers.AndroidSchedulers
import androidx.lifecycle.MutableLiveData
import com.example.mvvmdemo.R

@Module


class PostListViewModel : BaseViewModel() {

    @Inject
    lateinit var postApi: PostApi

    private lateinit var subscription: Disposable
    val loadingVisibility: MutableLiveData<Int> = MutableLiveData()

    val errorMessage:MutableLiveData<Int> = MutableLiveData()
    val errorClickListener = View.OnClickListener { loadPosts() }

    init{
        loadPosts()
    }

    private fun loadPosts(){
        subscription = postApi.getPosts()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { onRetrievePostListStart() }
            .doOnTerminate { onRetrievePostListFinish() }
            .subscribe(
                { onRetrievePostListSuccess() },
                { onRetrievePostListError() }
            )
    }

    private fun onRetrievePostListStart(){
        loadingVisibility.value = View.VISIBLE
        errorMessage.value = null
    }

    private fun onRetrievePostListFinish(){
        loadingVisibility.value = View.GONE
    }


    private fun onRetrievePostListSuccess(){

    }

    private fun onRetrievePostListError(){
        errorMessage.value = R.string.post_error//"An error occurred while loading the posts"
    }

    override fun onCleared() {
        super.onCleared()
        subscription.dispose()
    }
}

private fun Any.subscribe(function: () -> Unit, function1: () -> Unit): Disposable {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun Any.doOnTerminate(function: () -> Unit): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun <T> Observable<T>.subscribeOn(io: Scheduler): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun Any.doOnSubscribe(function: () -> Unit): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

private fun Any.observeOn(mainThread: Scheduler?): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

