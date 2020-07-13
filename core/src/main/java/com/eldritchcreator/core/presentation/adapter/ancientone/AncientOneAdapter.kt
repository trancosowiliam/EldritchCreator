package com.eldritchcreator.core.presentation.adapter.ancientone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.eldritchcreator.core.R
import com.eldritchcreator.core.presentation.adapter.SimpleSpaceMarginItemDecoration
import com.eldritchcreator.domain.model.AncientOne
import kotlinx.android.synthetic.main.item_ancient_one.view.*

class AncientOneAdapter(
    val data: List<AncientOne>,
    val onItemClickListener: (AncientOne) -> Unit
) : RecyclerView.Adapter<AncientOneAdapter.ViewHolder>() {

    companion object {
        fun setup(
            recyclerView: RecyclerView,
            data: List<AncientOne>,
            onItemClickListener: (AncientOne) -> Unit
        ) {
            recyclerView.addItemDecoration(
                SimpleSpaceMarginItemDecoration(
                    recyclerView.resources.getDimension(R.dimen.margin_normal).toInt()
                )
            )

            recyclerView.adapter =
                AncientOneAdapter(
                    data,
                    onItemClickListener
                )
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_ancient_one, parent, false)
    )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binder(data[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.setOnClickListener {
                onItemClickListener(data[adapterPosition])
            }
        }

        fun binder(ancientOne: AncientOne) {
            itemView.iaoImgPhoto.setImageResource(R.drawable.shubniggurath)
            itemView.iaoTxtName.text = ancientOne.name
            itemView.iaoTxtNickname.text = ancientOne.nickName
            itemView.iaoTxtDescription.text = ancientOne.asleepStatus.flavorText
        }
    }

}