package ru.nikolas_snek.productlist.presentation

import androidx.lifecycle.ViewModel
import ru.nikolas_snek.productlist.data.ShopListRepositoryImpl
import ru.nikolas_snek.productlist.domain.use_case.DeleteShopItemUseCase
import ru.nikolas_snek.productlist.domain.use_case.EditProductUseCase
import ru.nikolas_snek.productlist.domain.use_case.GetAllProductsUseCase

class MainViewModel: ViewModel() {

    private val shopListRepositoryImpl = ShopListRepositoryImpl()

    private val getAllProductsUseCase = GetAllProductsUseCase(shopListRepositoryImpl)
    private val editProductsUseCase = EditProductUseCase(shopListRepositoryImpl)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(shopListRepositoryImpl)



}