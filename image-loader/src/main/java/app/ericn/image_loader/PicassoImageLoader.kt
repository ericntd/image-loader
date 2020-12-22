package app.ericn.image_loader

import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.squareup.picasso.Picasso

object PicassoImageLoader : ImageLoaderContract {
    override fun loadImage(
        url: String,
        imageView: ImageView,
        @DrawableRes placeholder: Int?,
        @DrawableRes errorDrawable: Int?
    ) {
        val requestCreator = Picasso.Builder(imageView.context)
            .loggingEnabled(BuildConfig.DEBUG)
            .build()
            .load(url)

        if (placeholder != null) requestCreator.placeholder(placeholder)
        if (errorDrawable != null) requestCreator.error(errorDrawable)

        requestCreator.into(imageView)
    }

    override fun loadImage(
        imageRes: Int,
        imageView: ImageView,
        placeholder: Int?,
        errorDrawable: Int?
    ) {
        val requestCreator = Picasso.Builder(imageView.context)
            .loggingEnabled(BuildConfig.DEBUG)
            .build()
            .load(imageRes)

        if (placeholder != null) requestCreator.placeholder(placeholder)
        if (errorDrawable != null) requestCreator.error(errorDrawable)

        requestCreator.into(imageView)
    }
}