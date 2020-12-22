### Overview
The image-loader module gives you the flexibility to switch between Glide, Picasso and other image loading libraries easily.

### Usage
1. Copy and paste the `image-loader` module into your project
2. Don't forget to add it to your `settings.gradle` and `app/build.gradle` (as a dependencies)
3. You can use the built-in ImageLoader which leverages the Decorator Pattern here:

Set it up
```kotlin
class DemoApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ImageLoader.setUp(ImageLoader.Provider.GLIDE)
    }
}
```
and use it similar to how you use Glide or Picasso
```kotlin
ImageLoader.loadImage("https://www.humanesociety.org/sites/default/files/styles/1240x698/public/2018/08/kitten-440379.jpg", imageView)

Alternatively, you could configure the image provider through a dependency injection tool like Dagger

Provision
```kotlin
@Module
class ImageLoaderModule {
    @Singleton
    @Provides
    fun providesImageLoader() : ImageLoaderContract {
        return GlideImageLoader
    }
}
```
Consumption
```kotlin
class MainActivity : AppCompatActivity() {
    @Inject lateinit var imageLoader: ImageLoaderContract
    override fun onCreate(savedInstanceState: Bundle?) {
        //...
        imageLoader.loadImage("https://www.humanesociety.org/sites/default/files/styles/1240x698/public/2018/08/kitten-440379.jpg", imageView)
    }
}
```
