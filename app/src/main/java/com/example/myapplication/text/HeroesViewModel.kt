package com.example.myapplication.text

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.myapplication.Person
import com.example.myapplication.getheroList
import kotlinx.coroutines.delay

class HeroesViewModel : ViewModel() {
    val superheroes: LiveData<List<Person>> = liveData {
        val superheroList = loadSuperheroes()
        emit(superheroList)
    }

    // Added a delay of 2 seconds to emulate a network request. This method just sets the list of
    // superheroes to the livedata after 2 seconds.
    suspend fun loadSuperheroes(): List<Person> {
        delay(2000)
        return getheroList()
    }
}
