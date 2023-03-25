package com.androiddevs.ktornoteapp

object Constants {
    const val DATABASE_NAME = "notes_db"
    val IGNORE_AUTH_URLS = listOf("/login", "/register")
    const val BASE_URL = "http://10.0.2.2:8001" // use 192.168.1.100 for real device testing (not emulator)
    const val ENCRYPTED_SHARED_PREF_NAME = "encrypted_shared_pref"
}