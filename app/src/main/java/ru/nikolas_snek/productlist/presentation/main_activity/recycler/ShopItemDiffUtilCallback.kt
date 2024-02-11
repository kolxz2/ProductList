package ru.nikolas_snek.productlist.presentation.main_activity.recycler

import androidx.recyclerview.widget.DiffUtil
import ru.nikolas_snek.productlist.domain.repository.ShopItem

class ShopItemDiffUtilCallback: DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }
}