package com.meekoo.hilttutorial

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.meekoo.hilttutorial.di.AppModule
import com.meekoo.hilttutorial.ui.MyViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    @Inject @Named(AppModule.NAMED_QUALIFIER_STRING_1) lateinit var text1: String
    @Inject @Named(AppModule.NAMED_QUALIFIER_STRING_2) lateinit var text12: String

    val viewModel: MyViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "debug: Text1: $text1")
        Log.d(TAG, "debug: Text2: $text12")
        viewModel
    }
}