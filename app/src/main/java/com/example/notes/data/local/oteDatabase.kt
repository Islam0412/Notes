package com.example.notes.data.local

import android.provider.ContactsContract
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notes.data.model.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): ContactsContract.CommonDataKinds.Note

}