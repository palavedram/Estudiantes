package com.estudiantes.firebase.Service

import com.estudiantes.firebase.entity.EstudiantesDtos
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.ktx.app

class FirebaseService {

    private val db = FirebaseFirestore.getInstance(Firebase.app("bd-firebase"))
    private val collection = db.collection("usuario")

    fun sendEstudiantesParaFirebase(){
    val estudiante = EstudiantesDtos(

        id = "1",
        name = "Julian",
        city  = "Alp",
        age = 29
    )
        val documentos = estudiante.id?.let { id ->
            collection.document(id.toString())
        } ?:collection.document()
        documentos.set(estudiante)

        }



    }




