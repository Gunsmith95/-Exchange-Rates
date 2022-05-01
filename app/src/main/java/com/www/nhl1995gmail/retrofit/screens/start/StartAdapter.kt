package com.www.nhl1995gmail.retrofit.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.www.nhl1995gmail.retrofit.R
import com.www.nhl1995gmail.retrofit.databinding.ItemMoneyLoyoutBinding
import com.www.nhl1995gmail.retrofit.model.nal.Nalichka
import com.www.nhl1995gmail.retrofit.model.nal.NalichkaItem


class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>() {

    private var listStart = emptyList<NalichkaItem>()

    class StartViewHolder(root: View) : RecyclerView.ViewHolder(root) {

        private val binding = ItemMoneyLoyoutBinding.bind(root)
        fun bind(item: NalichkaItem) = with(binding) {
            itemName.text = item.ccy
            itemBye.text = item.buy
            itemSale.text = item.sale
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_money_loyout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {

        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {

        return listStart.size
    }

    private fun getItem(position: Int): NalichkaItem {
        return listStart[position]
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList (list: Nalichka){
        list.also { listStart = it }
        notifyDataSetChanged()
    }
}