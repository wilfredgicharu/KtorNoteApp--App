package com.androiddevs.ktornoteapp.di

import android.content.Context
import androidx.room.Room
import com.androiddevs.ktornoteapp.Constants.DATABASE_NAME
import com.androiddevs.ktornoteapp.data.local.NotesDatabase
import com.androiddevs.ktornoteapp.data.remote.BasicAuthInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        NotesDatabase::class.java, DATABASE_NAME

    ).build()

    @Singleton
    @Provides
    fun providesNoteDao(db: NotesDatabase) = db.noteDao()

    @Singleton
    @Provides
    fun providesbasicAuthInterceptor() = BasicAuthInterceptor()

    @Singleton
    @Provides
    fun providesNoteApi() = NoteApi()
}