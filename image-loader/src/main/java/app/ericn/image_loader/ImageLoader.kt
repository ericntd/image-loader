package app.ericn.image_loader

import android.widget.ImageView
import com.squareup.picasso.Picasso

object ImageLoader : ImageLoaderContract {
    private var imageLoader: ImageLoaderContract? = null

    enum class Provider {
        GLIDE,
        PICASSO
    }

    fun setUp(provider: Provider) {
        imageLoader = when (provider) {
            Provider.GLIDE -> GlideImageLoader
            Provider.PICASSO -> PicassoImageLoader
        }
    }

    override fun loadImage(
        url: String,
        imageView: ImageView,
        placeholder: Int?,
        errorDrawable: Int?
    ) {
        imageLoader?.run {
            loadImage(url, imageView, placeholder, errorDrawable)
        }
    }

    override fun loadImage(
        imageRes: Int,
        imageView: ImageView,
        placeholder: Int?,
        errorDrawable: Int?
    ) {
        imageLoader?.run {
            loadImage(imageRes, imageView, placeholder, errorDrawable)
        }
    }
}