package com.jmlb0003.training1.myfirstkotlinapp.presentation.details

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jmlb0003.training1.myfirstkotlinapp.R
import com.jmlb0003.training1.myfirstkotlinapp.model.Item
import com.jmlb0003.training1.myfirstkotlinapp.utils.loadUrl
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(),
        DetailsPresenter.CatDetailsView {

    companion object {
        val EXTRA_ITEM_ID = "key:extra_item_id"
    }

    var presenter: DetailsPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.setHomeButtonEnabled(true)

        presenter = DetailsPresenter(this, getItemIdToShow())
        presenter!!.loadDetails()
    }

    override fun showTitle(title: String) {
        supportActionBar!!.title = title
    }

    override fun showItemDetails(itemToShow: Item) {
        item_image.loadUrl(itemToShow.url)
        item_title.text = itemToShow.title
    }

    private fun getItemIdToShow(): Long {
        return intent.getLongExtra(EXTRA_ITEM_ID, -1)
    }

}
