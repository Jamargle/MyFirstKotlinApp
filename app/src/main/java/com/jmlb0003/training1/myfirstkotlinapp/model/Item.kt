package com.jmlb0003.training1.myfirstkotlinapp.model

fun getItems(): List<Item> {
    return (1..10).map {
        Item(
                it.toLong(),
                "title $it",
                "http://lorempixel.com/400/400/cats/$it/")
    }
}

data class Item(val id: Long, val title: String, val url: String)
