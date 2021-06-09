package com.example.pestcontrolap

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteException
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler (context: Context) : SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {
    companion object{
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "UserDatabase"
        private val TABLE_USERS = "UserTable"
        private val KEY_ID = "id"
        private val KEY_NAME = "name"
        private val KEY_EMAIL = "email"
        private val KEY_VISIT_DATE = "visit_date"
        private val KEY_PHONE_NO = "Phone_no"
        private val KEY_LAST_NAME = "lastName"
        private val KEY_FIRST_NAME = "firstName"
        private val KEY_House_no = "House_no"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_CONTACTS_TABLE = ("CREATE TABLE " + TABLE_USERS +
                "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"+ KEY_FIRST_NAME +
                " TEXT,"+ KEY_EMAIL + " TEXT,"+ KEY_LAST_NAME +
                " TEXT,"+ KEY_PHONE_NO + " TEXT,"+ KEY_VISIT_DATE + " TEXT,"+ KEY_House_no + "NUMBER,"
                + KEY_EMAIL + " TEXT" + ")")
        db?.execSQL(CREATE_CONTACTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS" + TABLE_USERS)
        onCreate(db)
    }
    fun addUsers(sqlListModel: sqlListModel): Long{
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(KEY_ID, sqlListModel.userId)
        contentValues.put(KEY_NAME, sqlListModel.userName)
        contentValues.put(KEY_EMAIL, sqlListModel.userEmail)
        contentValues.put(KEY_PHONE_NO, sqlListModel.Phone_no)
        contentValues.put(KEY_FIRST_NAME, sqlListModel.firstName)
        contentValues.put(KEY_LAST_NAME, sqlListModel.lastName)
        contentValues.put(KEY_VISIT_DATE, sqlListModel.Visit_date)
        contentValues.put(KEY_VISIT_DATE, sqlListModel.Visit_date)
        contentValues.put(KEY_House_no, sqlListModel.House_no)

        val success = db.insert(TABLE_USERS,null,contentValues)
        db.close()
        return success

    }
    fun readData():List<sqlListModel>{
        val userArray: ArrayList<sqlListModel> = ArrayList<sqlListModel>()
        val selectQuery = "SELECT  * FROM $TABLE_USERS"
        val db = this.readableDatabase
        var cursor: Cursor? = null
        try{
            cursor = db.rawQuery(selectQuery, null)
        }catch (e: SQLiteException) {
            db.execSQL(selectQuery)
            return ArrayList()
        }
        var userId: Int
        var lastName: String
        var firstName: String
        var Phone_no: Int
        var Visit_date: Int
        var userName: String
        var House_no: Int
        var userEmail: String

        if (cursor.moveToFirst()) {
            do {
                userId = cursor.getInt(cursor.getColumnIndex("id"))
                userName = cursor.getString(cursor.getColumnIndex("name"))
                userEmail = cursor.getString(cursor.getColumnIndex("email"))
                lastName = cursor.getString(cursor.getColumnIndex("lastName"))
                firstName = cursor.getString(cursor.getColumnIndex("firstName"))
                Phone_no = cursor.getInt(cursor.getColumnIndex("number"))
                Visit_date = cursor.getInt(cursor.getColumnIndex("date"))
                House_no =cursor.getInt(cursor.getColumnIndex( "number"))
                val emp= sqlListModel(userId = userId,
                        userName = userName,
                        userEmail = userEmail,
                        Email = userEmail,
                        lastName = lastName,
                        firstName = firstName,
                        Visit_date = Visit_date,
                        House_no = House_no,
                        Phone_no = Phone_no)
                userArray.add(emp)
            } while (cursor.moveToNext())
        }

        return userArray
    }
}



