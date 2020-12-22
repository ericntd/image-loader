package app.ericn.imageloaderdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import app.ericn.image_loader.ImageLoader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.the_image)
        ImageLoader.loadImage("https://www.humanesociety.org/sites/default/files/styles/1240x698/public/2018/08/kitten-440379.jpg", imageView)
    }
}