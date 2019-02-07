package org.silvatech.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import org.silvatech.swoosh.Model.Player
import org.silvatech.swoosh.R
import org.silvatech.swoosh.Utilities.EXTRA_PLAYER

class LeagueActivity : BaseActivity() {

    //var selectedLeague = ""
    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensClicked(view: View){
        womanLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"

    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"

    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womanLeagueBtn.isChecked = false
        player.league = "co-ed"

    }


    fun leagueNextClicked (view: View){
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league option.", Toast.LENGTH_LONG).show()
        }
    }


}
