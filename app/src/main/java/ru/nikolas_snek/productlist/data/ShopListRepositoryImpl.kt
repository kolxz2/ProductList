package ru.nikolas_snek.productlist.data

import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.repository.ShopListRepository

class ShopListRepositoryImpl : ShopListRepository {

    private val shopList: MutableList<ShopItem> = mutableListOf()

    private var autoIncrement = 0


    override fun deleteSopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldShopItem = getShopItem(shopItem.id)
        shopList.remove(oldShopItem)
        addShopItem(shopItem)
    }

    override fun getAllShopItem(): List<ShopItem> {
        return shopList.toList()
    }

    override fun getShopItem(getShopItemId: Int): ShopItem {
        return shopList.first {
            it.id == getShopItemId
        } ?: throw RuntimeException("Element with id $getShopItemId not find")
    }

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID){
            shopItem.id = autoIncrement++
        }
        shopList.add(shopItem)
    }
}