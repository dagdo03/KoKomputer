package com.example.foodapp.data.mapper

import com.example.foodapp.data.model.Cart
import com.example.foodapp.data.source.local.database.entity.CartEntity

fun Cart?.toCartEntity() =
    CartEntity(
        id = this?.id,
        productId = this?.productId.orEmpty(),
        itemQuantity = this?.itemQuantity ?: 0,
        productName = this?.productName.orEmpty(),
        productPrice = this?.productPrice ?: 0,
        productImgUrl = this?.productImgUrl.orEmpty(),
        itemNotes = this?.itemNotes,
    )

fun CartEntity?.toCart() =
    Cart(
        id = this?.id,
        productId = this?.productId.orEmpty(),
        itemQuantity = this?.itemQuantity ?: 0,
        productName = this?.productName.orEmpty(),
        productPrice = this?.productPrice ?: 0,
        productImgUrl = this?.productImgUrl.orEmpty(),
        itemNotes = this?.itemNotes,
    )

fun List<CartEntity?>.toCartList() = this.map { it.toCart() }
