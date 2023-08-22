package com.dk.learning.domain.util

sealed class OrderType {

    object Ascending : OrderType()
    object Descending : OrderType()

}
