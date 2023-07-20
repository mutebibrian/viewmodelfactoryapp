package com.kotlinseries.viewmodelsimpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.kotlinseries.viewmodelsimpleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Let start definining object reference variable for the viewmodel
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var binding:ActivityMainBinding
    //
    lateinit var factory:MainActivityViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //binding object
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //ViewModel Factory
factory= MainActivityViewModelFactory(100)
        //You can see here it appears since how to how to start from which number since we are using the factory
        //that allows us to set a custom variables and custom parameters to the view model.

        //viewmodel
        viewModel=ViewModelProvider(this,factory).get(MainActivityViewModel::class.java)
        //So I just passed here the factory of the View Model



//so i need to callthe viewmodel object.get currentcount
        //we use the  method we defined in our mainactivityviewmodel classs to update
        //and get the count value
        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdateCount().toString()
        }
    }

}
//So I just initialized the factory that I've created and passed as a second parameter inside the view
//model in order to use make use of this was starting number, which is 100.