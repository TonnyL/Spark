# Spark
[![Build Status](https://travis-ci.org/TonnyL/Spark.svg?branch=master)](https://travis-ci.org/TonnyL/Spark)
[![Download](https://api.bintray.com/packages/tonnyl/maven/spark/images/download.svg) ](https://bintray.com/tonnyl/maven/spark/_latestVersion)

Create gradient animations like Instagram&Spotify.

# Screenshots
<div align="center">
	<img src="./art/spark.gif" width="256" alt="screenshot">
</div>

## Usage
```kotlin
private lateinit var mSpark: Spark

override fun onCreate(savedInstanceState: Bundle?) {
    // ...

    mSpark = Spark.Builder()
            .setView(frameLayout) // View or view group
            .setDuration(4000)
            .setAnimList(Spark.ANIM_GREEN_PURPLE)
            .build()

}

override fun onResume() {
    // ...
    mSpark.startAnimation()
}

override fun onPause() {
    // ...
    mSpark.stopAnimation()
}
```

## Installation
### Gradle
+ Add the JitPack repository to your **root** `build.gradle` file:

```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```

+ Add the code to your **module**'s `build.gradle` file:

```gradle
dependencies {
    implementation 'io.github.tonnyl:spark:x.y.z'
}
```

### Maven
```xml
<dependency>
  <groupId>io.github.tonnyl</groupId>
  <artifactId>spark</artifactId>
  <version>x.y.z</version>
  <type>pom</type>
</dependency>
```

## Custom Gradient Colors
### Create gradient drawables
`purple_drawable.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <gradient
        android:centerColor="#e459aa"
        android:endColor="#cd7be6"
        android:startColor="#f14589"
        android:type="linear" />

    <corners android:radius="0dp" />

</shape>
```

`yellow_drawable.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">

    <gradient
        android:centerColor="#F4A37B"
        android:endColor="#F08875"
        android:startColor="#F9CB87"
        android:type="linear"/>

    <corners android:radius="0dp" />

</shape>
```

### Create the Animation List
`custom_anim_list.xml`

```xml
<?xml version="1.0" encoding="utf-8"?>
<animation-list xmlns:android="http://schemas.android.com/apk/res/android"
    android:oneshot="false">

    <item
        android:drawable="@drawable/yellow_drawable"
        android:duration="4500" />

    <item
        android:drawable="@drawable/purple_drawable"
        android:duration="4500" />

</animation-list>
```

### Apply Your Custom Animation List
```kotlin
mSpark = Spark.Builder()
        // ...
        .setAnimList(R.drawable.custom_anim_list) // Your custom animation 
        // ...
```

## Thanks

Designed by [Alexander Zaytsev](https://dribbble.com/anwaltzzz).

![Sketch Gradients](./art/Sketch_Gradients.png)

## License
Spark is under the MIT license. See the [LICENSE](LICENSE) for more information.