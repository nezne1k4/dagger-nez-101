package com.yahami.dagger_100.ui

import android.content.res.Resources
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.yahami.dagger_100._Dagger100Application
import javax.inject.Inject
import javax.inject.Named

abstract class BaseActivity : AppCompatActivity() {

//    @Inject
//    lateinit var res : Resources
//
//    @field:[Inject Named("something")]
//    lateinit var something: String
//
//    @field:[Inject Named("somethingElse")]
//    lateinit var somethingElse: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // seed the dagger
        //_Dagger100Application.graph.inject(this)
    }
}