package app.ericn.imageloaderdemo

import android.app.Application
import app.ericn.image_loader.ImageLoader

class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ImageLoader.setUp(ImageLoader.Provider.GLIDE)
    }
}