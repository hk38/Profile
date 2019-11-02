package app.kato.amida.profile

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myNameButton.setOnClickListener{
            myNameButton.setBackgroundColor(Color.parseColor("#13D3B1"))
            myLikeSuportsButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myImageView.setImageResource(R.drawable.tobisuke)
            myText.text = "とびすけ"
        }

        myLikeSuportsButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeSuportsButton.setBackgroundColor(Color.parseColor("#13D3B1"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myImageView.setImageResource(R.drawable.soccer)
            myText.text = "サッカー"
        }

        myLikeFoodsButton.setOnClickListener {
            myNameButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeSuportsButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#13D3B1"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myImageView.setImageResource(R.drawable.sushi)
            myText.text = "すし"
        }

        myLikeHobbyButton.setOnClickListener{
            myNameButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeSuportsButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeFoodsButton.setBackgroundColor(Color.parseColor("#7E7E7E"))
            myLikeHobbyButton.setBackgroundColor(Color.parseColor("#13D3B1"))
            myImageView.setImageResource(R.drawable.dance)
            myText.text = "ダンス"
        }

//        自己紹介1
//        myImageView.visibility = View.INVISIBLE
//        myText.visibility = View.INVISIBLE
//
//        myNameButton.setOnClickListener {
//            myImageView.visibility = View.VISIBLE
//            myText.visibility = View.VISIBLE
//        }
    }
}
