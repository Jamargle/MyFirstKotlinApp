package com.jmlb0003.training1.myfirstkotlinapp.presentation.list

import com.jmlb0003.training1.myfirstkotlinapp.presentation.BasePresenter
import com.jmlb0003.training1.myfirstkotlinapp.presentation.list.ListPresenter.CatListView

class ListPresenter(override var view: CatListView?) : BasePresenter<CatListView> {

    interface CatListView {
    }

}
