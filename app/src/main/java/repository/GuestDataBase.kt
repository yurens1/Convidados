package repository

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.convidados.constants.DataBaseConstants

class GuestDataBase(context: Context) : SQLiteOpenHelper(context, NAME, null, VERSION) {


        companion object {
            private const val NAME = "guestdb"
            private const val VERSION = 1
        }

    override fun onCreate(db: SQLiteDatabase?) {


        if (db != null) {
            db.execSQL("create table "+ DataBaseConstants.GUEST.TABLE_NAME +"(" +
                    "id integer primary key autoincrement," +
                    " name text, " +
                    " presence integer);")
        }
        }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        if (oldVersion == 1) {
            if (newVersion == 1) {
                //ATUALIZADO
            }
        }

    }
    }


