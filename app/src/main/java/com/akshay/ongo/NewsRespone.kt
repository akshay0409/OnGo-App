package com.akshay.ongo

data class NewsRespone(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)