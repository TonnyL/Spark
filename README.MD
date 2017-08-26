# Spark(Work-in-progress)
Create gradient animations like Instagram.

# Screenshots
<div align="center">
	<img src="./art/spark.gif" width="256" alt="screenshot">
</div>

## Usage
### Kotlin
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	setContentView(R.layout.activity_main)
	
	val spark = Spark.Builder()
	        .setView(frameLayout) // View or view group
	        .setDuration(4000)
	        .setAnimList(Spark.ANIM_GREEN_PURPLE)
	        .build()
	spark.startAnimation()
}
```

### Java
```java
@Override
protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Spark spark = new Spark.Builder()
            .setDuration(4000)
            .setAnimList(R.drawable.custom_anim_list) // Custom the animation drawable list.
            .setView(findViewById(R.id.frameLayout))
            .build();
    spark.startAnimation();
}
```

## Installation
It will be published on jcenter in the future.

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

### Create the animation list
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

### Apply your custom animation list
```kotlin
Spark.Builder()
    .setView(frameLayout) // View or view group
    .setDuration(4000)
    .setAnimList(Spark.ANIM_GREEN_PURPLE)
    .build()
    .startAnimation()
```

For the colors, I referred to [Alexander Zaytsev](https://dribbble.com/anwaltzzz)'s [shot](https://dribbble.com/shots/3380672-Sketch-Gradients-Freebie) on Dribbble.

![Sketch Gradients](./art/Sketch_Gradients.png)

## License
```
The MIT License (MIT)

Copyright (c) 2017 Lizhaotailang

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```