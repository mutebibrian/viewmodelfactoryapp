package com.kotlinseries.viewmodelsimpleapp

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingnum:Int):ViewModel() {
    //I will create a primary constructor up here.
    private var count = 0
    //initialise count
    init {
        count = startingnum
    }

    fun getCurrentCount():Int{
        return count
    }
    fun getUpdateCount(): Int {
        return ++count
    }

}

//Note:There's no way because I'm using the view model provider here and I need to specify the view model directly
//without passing any parameters to this.
//How to start from a number specific number that the user will specify.
//We will use the factory, the view model factory.

//Next
//I will create Create a new Kotlin class and I will name it as main activity View Model Factory.

