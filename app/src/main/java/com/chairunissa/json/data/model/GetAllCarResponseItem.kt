package com.chairunissa.json.data.model

data class GetAllCarResponseItem(
    val category: String,
    val createdAt: String,
    val finish_rent_at: String,
    val id: Int,
    val image: String,
    val name: String,
    val price: Int,
    val start_rent_at: String,
    val status: Boolean,
    val updatedAt: String
)