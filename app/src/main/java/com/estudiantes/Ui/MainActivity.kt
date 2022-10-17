package com.estudiantes.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.estudiantes.R
import com.estudiantes.firebase.Service.FirebaseService
import com.estudiantes.inicializatorFirebase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inicializatorFirebase(this)

        val firebaseService = FirebaseService()

        firebaseService.sendEstudiantesParaFirebase()
    }
}