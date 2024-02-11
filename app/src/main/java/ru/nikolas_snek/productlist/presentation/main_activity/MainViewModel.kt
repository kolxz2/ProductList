package ru.nikolas_snek.productlist.presentation.main_activity

import androidx.lifecycle.ViewModel
import ru.nikolas_snek.productlist.data.ShopListRepositoryImpl
import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.use_case.DeleteShopItemUseCase
import ru.nikolas_snek.productlist.domain.use_case.EditShopItemUseCase
import ru.nikolas_snek.productlist.domain.use_case.GetShopListUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteSopItem(shopItem)
    }

    fun changeEnableState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}