package repository

import android.content.ContentValues
import android.content.Context

class GuestRepository private constructor(context: Context) {

//singleton
        private val guestDataBase = GuestDataBase(context)

    companion object {
        private lateinit var repository: GuestRepository

        fun getInstance(context: Context): GuestRepository {
            if (!Companion::repository.isInitialized) {
                repository = GuestRepository(context)
            }
            return repository
        }

      }

        fun insert(guest: GuestModels) {


            val db = guestDataBase.writableDatabase

            val presence = if (guest.presence) 1 else 0

            val values = ContentValues()
            values.put("name", guest.name)
            values.put("presence", guest.presence)

            db.insert("Guest", null, values)

              }



        }

        fun update(){


        }


