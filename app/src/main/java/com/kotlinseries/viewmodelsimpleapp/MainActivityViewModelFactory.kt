package com.kotlinseries.viewmodelsimpleapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


//But first I need to pass the starting point of this and starting number of this counter.
//extends viewModelProvider.factory {
class MainActivityViewModelFactory(private val startingNum:Int): ViewModelProvider.Factory {
    //override function create,,,,Tool modelclass as the parameter and will return T any type
    //You can use it when in all of your view model factory.
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        //These are boilerplate code as them acting as a template for all your view model, factory
    // and view model classes
        if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingNum) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }


}

//NOTE: Now let's move to the main activity and edit some codes to in order to get the data from the View model
//
//through the View Model factory