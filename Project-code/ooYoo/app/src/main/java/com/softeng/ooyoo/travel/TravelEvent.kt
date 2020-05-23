package com.softeng.ooyoo.travel

import android.os.Parcelable
import com.softeng.ooyoo.helpers.dateMapToMillis
import com.softeng.ooyoo.place.Place
import kotlinx.android.parcel.Parcelize

@Parcelize
open class TravelEvent(
    open val uid: String? = "",
    open val place: Place = Place(),
    open val dates: Dates = Dates()): Parcelable