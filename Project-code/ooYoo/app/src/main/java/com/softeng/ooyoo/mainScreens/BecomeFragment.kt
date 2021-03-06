package com.softeng.ooyoo.mainScreens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.softeng.ooyoo.R
import com.softeng.ooyoo.helpers.toast
import com.softeng.ooyoo.trip.BecomeTravellerActivity
import com.softeng.ooyoo.host.HostFormActivity
import com.softeng.ooyoo.user.User

/**
 * This fragment represents the GUI from which a user can create
 * a travel event (trip plan, hosting, carpooling).
 */
class BecomeFragment : Fragment(),PassUser {

    private lateinit var user: User

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?    ): View? {
        val view = inflater.inflate(R.layout.fragment_become, container, false)

        val tripPlanButton = view.findViewById<CardView>(R.id.trip_plan_button)
        val carpoolingButton = view.findViewById<CardView>(R.id.carpooling_button)
        val hostButton = view.findViewById<CardView>(R.id.hostButton)

        tripPlanButton.setOnClickListener{
            val intent = Intent(context, BecomeTravellerActivity::class.java)
            startActivity(intent)
        }

        carpoolingButton.setOnClickListener {
            context?.toast("This feature is not implemented yet.")
        }

        hostButton.setOnClickListener{
            createHostForm()
        }

        return view
    }

    /**
     * This method is used to create a hosting form.
     */
    private fun createHostForm(){
        val intent = Intent(context, HostFormActivity::class.java)
        startActivity(intent)
    }

    /**
     * Set the current user.
     */
    override fun setUser(user: User) {
        this.user = user
    }

}
