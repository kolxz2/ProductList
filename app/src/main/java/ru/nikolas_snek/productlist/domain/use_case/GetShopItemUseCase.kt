package ru.nikolas_snek.productlist.domain.use_case

import ru.nikolas_snek.productlist.domain.repository.ShopListRepository
import ru.nikolas_snek.productlist.domain.repository.ShopItem

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}