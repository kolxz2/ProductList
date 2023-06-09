package ru.nikolas_snek.productlist.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.repository.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopListLD  = MutableLiveData<List<ShopItem>>()
    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrement = 0

    init {
        for (i in 0 until 10){
            val item = ShopItem("Name $i", 5, true)
            addShopItem(item)
        }
    }


    override fun deleteSopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateLiveData()
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldShopItem = getShopItem(shopItem.id)
        shopList.remove(oldShopItem)
        addShopItem(shopItem)
    }

    override fun getAllShopItem(): LiveData<List<ShopItem>> {
        return shopListLD
    }

    override fun getShopItem(getShopItemId: Int): ShopItem {
        return shopList.first {
            it.id == getShopItemId
        }
    }

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID) {
            shopItem.id = autoIncrement++
        }
        shopList.add(shopItem)
        updateLiveData()
    }

    private fun updateLiveData(){
        shopListLD.value = shopList.toList()
    }
}