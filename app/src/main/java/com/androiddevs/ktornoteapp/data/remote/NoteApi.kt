package com.androiddevs.ktornoteapp.data.remote

import com.androiddevs.ktornoteapp.data.remote.request.AccountRequest
import com.androiddevs.ktornoteapp.data.remote.rsponses.SimpleResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface NoteApi {

    @POST("/register")
    suspend fun register(
       @Body registerRequest: AccountRequest
    ): Response<SimpleResponse>

    @POST("/login")
    suspend fun login(
        @Body loginRequest: AccountRequest
    ): Response<SimpleResponse>
}