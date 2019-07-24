package com.base

import androidx.lifecycle.ViewModel

/**
 * By default in Kotlin all classes are final. To make a class derivable we need to add open or abstract
 * before class keyword.
 * open : functions are overridden
 * abstract : No need to override, direct call the function
 * */
abstract class BaseViewModel : ViewModel() {

}