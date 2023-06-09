package ru.nikolas_snek.productlist.domain.repository

interface ShopListRepository {

    fun deleteSopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getAllShopItem(): List<ShopItem>

    fun getShopItem(getShopItemId: Int): ShopItem

    fun addShopItem(shopItem: ShopItem)
}