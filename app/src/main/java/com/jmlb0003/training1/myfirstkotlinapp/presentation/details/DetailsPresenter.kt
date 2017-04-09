package com.jmlb0003.training1.myfirstkotlinapp.presentation.details

import com.jmlb0003.training1.myfirstkotlinapp.model.Item
import com.jmlb0003.training1.myfirstkotlinapp.model.getItems
import com.jmlb0003.training1.myfirstkotlinapp.presentation.BasePresenter

class DetailsPresenter(override var view: CatDetailsView?, val idItemToShow: Long) : BasePresenter<DetailsPresenter.CatDetailsView> {

    fun loadDetails() {
        view!!.showTitle(getItemToShow()!!.title)
        view!!.showItemDetails(getItemToShow()!!)
    }

    private fun getItemToShow(): Item? {
        return getItems().firstOrNull { it.id == idItemToShow }
    }

    interface CatDetailsView {

        fun showTitle(title: String)

        fun showItemDetails(itemToShow: Item)

    }

}
