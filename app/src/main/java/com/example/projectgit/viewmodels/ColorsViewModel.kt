package com.example.projectgit.viewmodels


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ColorsViewModel: ViewModel() {

    var name = "Change object"
    var listNames: List<String> = listOf("Juan", "Pepe", "Yulian", "Rodrigo", "Jaime")
    var listAnimals: List<String> = listOf("Pez", "Hipopotamo", "Cocodrilo", "Perro", "Gato")

    private val _animals = MutableLiveData<String>()
    val animals: LiveData<String> = _animals

    fun animalsRandom(){
        if(!listNames.isNullOrEmpty()){
            val randomAnimal = (listAnimals.indices).random()
            _animals.value = (listAnimals[randomAnimal])
        }
    }
}