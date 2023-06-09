package ru.nikolas_snek.productlist.domain.repository

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun deleteSopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getAllShopItem(): LiveData<List<ShopItem>>

    fun getShopItem(getShopItemId: Int): ShopItem

    fun addShopItem(shopItem: ShopItem)
}