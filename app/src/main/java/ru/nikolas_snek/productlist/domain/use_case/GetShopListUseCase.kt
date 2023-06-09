package ru.nikolas_snek.productlist.domain.use_case

import androidx.lifecycle.LiveData
import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.repository.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getAllShopItem(): LiveData<List<ShopItem>>{
        return shopListRepository.getAllShopItem()
    }
}