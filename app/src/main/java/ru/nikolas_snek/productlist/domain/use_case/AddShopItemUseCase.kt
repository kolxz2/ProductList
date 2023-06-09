package ru.nikolas_snek.productlist.domain.use_case

import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.repository.ShopListRepository

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItem(shopItem: ShopItem){
        shopListRepository.addShopItem(shopItem)
    }
}