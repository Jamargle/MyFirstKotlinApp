package com.jmlb0003.training1.myfirstkotlinapp.presentation

interface BasePresenter<T> {

    var view: T?

    fun attachView(view: T) {
        this.view = view
    }

    fun detachView() {
        view = null
    }

}