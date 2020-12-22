package app.ericn.image_loader

import android.widget.ImageView
import androidx.annotation.DrawableRes

interface ImageLoaderContract {
    fun loadImage(
        url: String,
        imageView: ImageView,
        @DrawableRes placeholder: Int? = null,
        @DrawableRes errorDrawable: Int? = null
    )

    fun loadImage(
        @DrawableRes imageRes: Int,
        imageView: ImageView,
        @DrawableRes placeholder: Int? = null,
        @DrawableRes errorDrawable: Int? = null
    )
}