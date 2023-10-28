package com.example.mad_practical_11_21012011093

class PersonTable {
    companion object{
        val TABLE_NAME="PERSON"
        val COLUMN_ID="ID"
        val COLUMN_NAME="NAME"
        val COLUMN_EMAIL="EMAIL"
        val COLUMN_ADDRESS="ADDRESS"
        val COLUMN_PHONENO="PHONENO"
        val COLUMN_LAT="LAT"
        val COLUMN_LONG="LONG"
    }

    val CREATE_TABLE = ("CREATE TABLE"+ TABLE_NAME + "("
            +COLUMN_ID+"TEXT PRIMARY KEY,"
            +COLUMN_NAME+"text,"
            +COLUMN_EMAIL+"text,"
            +COLUMN_ADDRESS+"text,"
            +COLUMN_PHONENO+"text,"
            +COLUMN_LAT+"REAL,"
            +COLUMN_LONG+"REAL,"

            +")")
}