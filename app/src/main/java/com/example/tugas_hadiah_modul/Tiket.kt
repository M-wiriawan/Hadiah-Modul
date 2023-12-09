package com.example.tugas_hadiah_modul

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tiket(
    val imgtiket: Int,
    val nameletiket: String,
    val desctiket: String

) : Parcelable
