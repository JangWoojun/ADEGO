package com.woojun.adego.dataClass

data class Meta(
    val is_end: Boolean,
    val pageable_count: Int,
    val same_name: SameName,
    val total_count: Int
)