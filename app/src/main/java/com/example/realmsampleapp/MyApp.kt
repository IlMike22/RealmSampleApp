package com.example.realmsampleapp

import android.app.Application
import com.example.realmsampleapp.models.Address
import com.example.realmsampleapp.models.Course
import com.example.realmsampleapp.models.Student
import com.example.realmsampleapp.models.Teacher
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

class MyApp: Application() {
    companion object {
        lateinit var realm: Realm
    }

    override fun onCreate() {
        super.onCreate()
        realm = Realm.open(
            configuration = RealmConfiguration.create(
                schema = setOf(
                    Address::class,
                    Teacher::class,
                    Course::class,
                    Student::class
                )
            )
        )
    }
}