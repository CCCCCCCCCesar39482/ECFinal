package com.cesar.ecfinalmovil.model

import android.graphics.Color

data class ecf(
    val name: String,
    val id: Int,
    val family: String,
    val order: String
)
fun getData() : List<ecf>{
    return listOf(
        ecf("Banana", 1, "Musaceae", "Zingiberales"),
        ecf("Banana", 2, "Musaceae", "Zingiberales"),
        ecf("Banana", 3, "Musaceae", "Zingiberales"),
        ecf("Banana", 4, "Musaceae", "Zingiberales"),
        ecf("Banana", 5, "Musaceae", "Zingiberales"),
        ecf("Banana", 6, "Musaceae", "Zingiberales"),
        ecf("Banana", 7, "Musaceae", "Zingiberales"),
        ecf("Banana", 8, "Musaceae", "Zingiberales"),
        ecf("Banana", 9, "Musaceae", "Zingiberales"),
        ecf("Banana", 10, "Musaceae", "Zingiberales"),




    )
}
