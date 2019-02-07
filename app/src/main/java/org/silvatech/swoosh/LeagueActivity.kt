package org.silvatech.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensClicked(view: View){
        womanLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "mens"

    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked = false
        womanLeagueBtn.isChecked = false
        selectedLeague = "co-ed"

    }


    fun leagueNextClicked (view: View){
        if(selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league option.", Toast.LENGTH_LONG).show()
        }
    }


}
