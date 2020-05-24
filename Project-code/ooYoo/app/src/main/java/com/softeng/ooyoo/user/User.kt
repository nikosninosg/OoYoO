package com.softeng.ooyoo.user

import android.os.Parcelable
import com.softeng.ooyoo.carpool.Carpooling
import com.softeng.ooyoo.carpool.DriverExperience
import com.softeng.ooyoo.chat.Chat
import com.softeng.ooyoo.helpers.Rating
import com.softeng.ooyoo.host.Hosting
import com.softeng.ooyoo.portfolio.PortfolioEntry
import com.softeng.ooyoo.trip.TripPlan
import kotlinx.android.parcel.Parcelize
import kotlin.collections.ArrayList

@Parcelize
open class User(
    var uid: String="",
    var username: String="",
    var email: String="",
    var fullName: String="",
    var phoneNumber: String="",
    var age: MutableMap<String, Int> = mutableMapOf(),
    var livingIn: String="",
    var languages: ArrayList<String> = arrayListOf(),
    var gender: String="",
    var interests: ArrayList<String> = arrayListOf(),
    val userRating: ArrayList<Rating> = arrayListOf(),
    val tripPlanHistory: ArrayList<TripPlan> = arrayListOf(),
    val hostHistory: ArrayList<Hosting> = arrayListOf(),
    val carpoolingHistory: ArrayList<Carpooling> = arrayListOf(),
    val portfolio: ArrayList<PortfolioEntry> = arrayListOf(),
    val chats: ArrayList<Chat> = arrayListOf(),
    val insurance: MutableMap<String, Int> = mutableMapOf(),
    val driverRating: ArrayList<Rating> = arrayListOf(),
    val driverExperience: DriverExperience = DriverExperience(),
    val premium: Boolean = false
): Parcelable{

    public fun checkFileSize(): Boolean{
        return true
    }

    public fun editInfo(user: User){

    }

    public fun checkUserRules(): Boolean{
        return true
    }

    public fun makeTripPlanChanges(tripPlan: TripPlan){

    }

    public fun makeHostingChanges(hosting: Hosting){

    }

    public fun makeCarpoolingChanges(carpooling: Carpooling){

    }

}