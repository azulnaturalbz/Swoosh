package org.silvatech.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import org.silvatech.swoosh.Utilities.EXTRA_LEAGUE
import org.silvatech.swoosh.R
import org.silvatech.swoosh.Utilities.EXTRA_SKILL

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onSkillFinishClicked(view: View){

        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE,league)
            finishActivity.putExtra(EXTRA_SKILL,skill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill option.", Toast.LENGTH_LONG).show()

        }
    }

    fun onClickBaller(view: View){
        beginnerSkillBtn.isChecked = false
        skill = "baller"
    }

    fun onClickBeginner(view: View){
        ballerSkillBtn.isChecked = false
        skill = "beginner"
    }
}
