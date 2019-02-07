package org.silvatech.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import org.silvatech.swoosh.Model.Player
import org.silvatech.swoosh.R
import org.silvatech.swoosh.Utilities.EXTRA_PLAYER

class SkillActivity : BaseActivity() {

    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onSkillFinishClicked(view: View){

        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill option.", Toast.LENGTH_LONG).show()

        }
    }

    fun onClickBaller(view: View){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onClickBeginner(view: View){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }
}
