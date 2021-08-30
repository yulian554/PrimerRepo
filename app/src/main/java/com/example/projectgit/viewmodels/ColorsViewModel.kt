package com.example.projectgit.viewmodels


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ColorsViewModel: ViewModel() {

    var nameOption = "Change object"
    var listNames: List<String> = listOf("Juan", "Pepe", "Yulian", "Rodrigo", "Jaime")
    var listAnimals: List<String> = listOf("Pez", "Hipopotamo", "Cocodrilo", "Perro", "Gato")
    var listAnime: List<String> = listOf("Goku", "Deku", "Naruto", "Sakura", "Charlotte")
    var listStuff: List<String> = listOf("Pala", "Mesa", "Teclado", "Celular", "Carro")

    private val _animals = MutableLiveData<String>()
    val animals: LiveData<String> = _animals
    private val _names = MutableLiveData<String>()
    val names: LiveData<String> = _names
    private val _animes = MutableLiveData<String>()
    val animes: LiveData<String> = _animes
    private val _stuff = MutableLiveData<String>()
    val stuff: LiveData<String> = _stuff
    private val _viewChange = MutableLiveData<String>()
    val viewChange: LiveData<String> = _viewChange

    fun animalsRandom(){
        if(!listAnimals.isNullOrEmpty()){
            val randomAnimal = (listAnimals.indices).random()
            _animals.value = (listAnimals[randomAnimal])
            _viewChange.postValue(animals.value)
        }
    }

    fun nameRandom(){
        if(!listNames.isNullOrEmpty()){
            val randomName = (listNames.indices).random()
            _names.value = (listNames[randomName])
            _viewChange.postValue(names.value)
        }
    }

    fun animeRandom(){
        if(!listAnime.isNullOrEmpty()){
            val randomAnime = (listAnime.indices).random()
            _animes.value = listAnime[randomAnime]
            _viewChange.postValue(animes.value)
        }
    }

    fun stuffRandom(){
        if(!listStuff.isNullOrEmpty()){
            val randomAnime = (listStuff.indices).random()
            _stuff.value = listStuff[randomAnime]
            _viewChange.postValue(stuff.value)
        }
    }

}