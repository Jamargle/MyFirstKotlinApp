package com.jmlb0003.training1.myfirstkotlinapp.presentation.list

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.jmlb0003.training1.myfirstkotlinapp.R
import com.jmlb0003.training1.myfirstkotlinapp.model.getItems
import com.jmlb0003.training1.myfirstkotlinapp.presentation.details.DetailActivity
import com.jmlb0003.training1.myfirstkotlinapp.presentation.list.adapter.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
        ListPresenter.CatListView {

    var presenter: ListPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()

        presenter = ListPresenter(this)
    }

    private fun initRecyclerView() {
        item_list.layoutManager = GridLayoutManager(this, 2)
        item_list.adapter = ItemAdapter(getItems()) { (id) ->
            goToDetails(id)
        }
    }

    private fun goToDetails(id: Long) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_ITEM_ID, id)
        startActivity(intent)
    }

}
