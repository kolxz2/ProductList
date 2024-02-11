package ru.nikolas_snek.productlist.domain.use_case

import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.repository.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteSopItem(shopItem: ShopItem){
        shopListRepository.deleteShopItem(shopItem)

    }

}