package com.rbnico.simplyteachingandroid.vewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rbnico.simplyteachingandroid.model.Student
import com.rbnico.simplyteachingandroid.model.StudentsProvider

class StudentsViewModel: ViewModel() {
    val studentsLiveData = MutableLiveData<List<Student>>()

    fun reload() {
        val students: List<Student> = StudentsProvider.get()
        studentsLiveData.postValue(students)
    }
}