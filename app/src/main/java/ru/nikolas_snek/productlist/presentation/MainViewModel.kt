package ru.nikolas_snek.productlist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.nikolas_snek.productlist.data.ShopListRepositoryImpl
import ru.nikolas_snek.productlist.domain.repository.ShopItem
import ru.nikolas_snek.productlist.domain.use_case.DeleteShopItemUseCase
import ru.nikolas_snek.productlist.domain.use_case.EditProductUseCase
import ru.nikolas_snek.productlist.domain.use_case.GetShopListUseCase

class MainViewModel: ViewModel() {

    private val shopListRepositoryImpl = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(shopListRepositoryImpl)
    private val editProductsUseCase = EditProductUseCase(shopListRepositoryImpl)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(shopListRepositoryImpl)

    val shopListLiveData = getShopListUseCase.getAllShopItem()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteSopItem(shopItem)
    }

    fun editShopItem(shopItem: ShopItem){
        val newShopItem = shopItem.copy(enabled = !shopItem.enabled)
        editProductsUseCase.editShopItem(newShopItem)
    }

}