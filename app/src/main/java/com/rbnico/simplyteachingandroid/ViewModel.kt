package com.rbnico.simplyteachingandroid

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.rbnico.simplyteachingandroid.data.Student


class ViewModel(application: Application) : AndroidViewModel(application) {

    private val students: MutableLiveData<List<Student>> by lazy {
        MutableLiveData<List<Student>>().also {
            loadStudents()
        }
    }

    fun getStudents(): LiveData<List<Student>> {
        return students
    }

    private fun loadStudents() {
        // Do an asynchronous operation to fetch users.
    }

    fun getTheme() {
    }

}