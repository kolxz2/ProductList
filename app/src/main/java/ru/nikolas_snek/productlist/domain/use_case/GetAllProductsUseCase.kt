package ru.nikolas_snek.productlist.domain.use_case

import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.repository.ShopListRepository

class GetAllProductsUseCase(private val shopListRepository: ShopListRepository) {

    fun getAllShopItem(): List<ShopItem>{
        return shopListRepository.getAllShopItem()
    }
}