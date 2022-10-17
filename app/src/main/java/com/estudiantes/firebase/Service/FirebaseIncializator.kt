package com.estudiantes

import android.content.Context
import android.util.Log
import com.google.firebase.FirebaseOptions
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.initialize

private const val TAG = "FirebaseIncializator"

fun inicializatorFirebase(context: Context) {
    val options = FirebaseOptions.Builder()
        .setProjectId("estudiantes-ed285")
        .setApplicationId("1:865946025963:android:07b26cd76cd2d7a13ae3ae")
        .build()
    try {
        Firebase.initialize(context, options, "bd-firebase")
    } catch (e: Exception) {
        Log.e(TAG, "FirebaseIncializator: ", e)
    }
}
