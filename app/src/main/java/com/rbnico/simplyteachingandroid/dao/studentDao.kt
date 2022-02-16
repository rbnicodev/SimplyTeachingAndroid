package com.rbnico.simplyteachingandroid.dao

import androidx.room.*
import com.rbnico.simplyteachingandroid.model.Student
import com.rbnico.simplyteachingandroid.model.User

@Dao
interface studentDao {
    @Query("SELECT * FROM student")
    fun getAll(): List<Student>

    @Query("SELECT * FROM student WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Student>

    @Query("SELECT * FROM student WHERE name LIKE :first AND " +
            "lastName LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Student

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(vararg users: User)

    @Update
    fun update(user: User)

}