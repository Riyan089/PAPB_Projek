package com.example.expdate.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_items")

data class ProductItems (

    @ColumnInfo(name = "itemName")
    var itemName: String,

    // create itemQuantity variable
    // to store grocery quantity.
    @ColumnInfo(name = "itemQuantity")
    var itemQuantity: Int,

    // create itemPrice variable to
    // store grocery price.
    @ColumnInfo(name = "itemDate")
    var itemDate: Int
    ) {
        // Primary key is a unique key
        // for different database.
        @PrimaryKey(autoGenerate = true)
        var id: Int? = null
    }
