package app.ericn.image_loader

import android.widget.ImageView
import com.bumptech.glide.Glide

object GlideImageLoader : ImageLoaderContract {
    override fun loadImage(
        url: String,
        imageView: ImageView,
        placeholder: Int?,
        errorDrawable: Int?
    ) {
        val requestBuilder = Glide.with(imageView.context)
            .load(url)

        if (placeholder != null) requestBuilder.placeholder(placeholder)
        if (errorDrawable != null) requestBuilder.error(errorDrawable)

        requestBuilder.into(imageView)
    }

    override fun loadImage(
        imageRes: Int,
        imageView: ImageView,
        placeholder: Int?,
        errorDrawable: Int?
    ) {
        val requestBuilder = Glide.with(imageView.context)
            .load(imageRes)

        if (placeholder != null) requestBuilder.placeholder(placeholder)
        if (errorDrawable != null) requestBuilder.error(errorDrawable)

        requestBuilder.into(imageView)
    }
}