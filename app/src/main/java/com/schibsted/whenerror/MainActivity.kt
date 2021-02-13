package com.schibsted.whenerror

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.schibsted.lib.KotlinModuleExhaustive
import com.schibsted.whenlibrary.Exhaustive

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun isExhaustive(exhaustive: Exhaustive) {
        val test = when(exhaustive) {
            Exhaustive.No -> TODO()
            Exhaustive.Yes -> TODO()
        }
    }

    fun isExhaustive(exhaustive: KotlinModuleExhaustive) {
        val test = when(exhaustive) {
            KotlinModuleExhaustive.No -> TODO()
            KotlinModuleExhaustive.Yes -> TODO()
        }
    }
}