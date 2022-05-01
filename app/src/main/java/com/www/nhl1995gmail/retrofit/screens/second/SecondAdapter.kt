package com.www.nhl1995gmail.retrofit.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.www.nhl1995gmail.retrofit.R
import com.www.nhl1995gmail.retrofit.databinding.ItemMoneyLoyoutBinding
import com.www.nhl1995gmail.retrofit.model.beznal.BezNal
import com.www.nhl1995gmail.retrofit.model.beznal.BezNalItem


class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    private var listStart = emptyList<BezNalItem>()

    class SecondViewHolder(root: View) : RecyclerView.ViewHolder(root) {

        private val binding = ItemMoneyLoyoutBinding.bind(root)
        fun bind(item: BezNalItem) = with(binding) {
            itemName.text = item.ccy
            itemBye.text = item.buy
            itemSale.text = item.sale
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {

        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_money_loyout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {

        holder.bind(getItem(position))
    }

    override fun getItemCount(): Int {

        return listStart.size
    }

    private fun getItem(position: Int): BezNalItem {
        return listStart[position]
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList (list: List<BezNalItem>){
        list.also { listStart = it }
        notifyDataSetChanged()
    }
}