package com.jmlb0003.training1.myfirstkotlinapp.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

fun Context.toast(text: CharSequence, length: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, text, length).show()
}

fun ViewGroup.inflate(layoutResource: Int): View {
    return LayoutInflater.from(context).inflate(layoutResource, this, false)
}

fun ImageView.loadUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}