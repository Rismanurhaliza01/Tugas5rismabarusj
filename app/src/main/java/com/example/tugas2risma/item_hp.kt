package com.example.tugas2risma

import android.os.Parcel
import android.os.Parcelable

data class item_hp(val gambar : Int, val nama : String, val harga : String, val stock : String, val imageSource:Int, val imageTitle:String, val imageDesc:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambar)
        parcel.writeString(nama)
        parcel.writeString(harga)
        parcel.writeString(stock)
        parcel.writeInt(imageSource)
        parcel.writeString(imageTitle)
        parcel.writeString(imageDesc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<item_hp> {
        override fun createFromParcel(parcel: Parcel): item_hp {
            return item_hp(parcel)
        }

        override fun newArray(size: Int): Array<item_hp?> {
            return arrayOfNulls(size)
        }
    }
}
