package ru.nikolas_snek.productlist.domain.repository

data class ShopItem(
    val product :String,
    val count: Int,
    val enabled :Boolean,
    var id: Int = UNDEFINED_ID
){
    companion object{
        // магическое число
        const val UNDEFINED_ID = -1
    }
}
