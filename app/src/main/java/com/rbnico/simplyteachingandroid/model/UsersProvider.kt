package com.rbnico.simplyteachingandroid.model

object UsersProvider {
    private val _users: List<User> = listOf(User("", ""))

    fun getAll() {
        _users
    }

    lateinit var currentUser: User
}