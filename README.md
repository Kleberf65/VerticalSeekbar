# VerticalSeekbar  ![GitHub](https://img.shields.io/github/license/Kleberf65/VerticalSeekbar.svg) [![Release](https://jitpack.io/v/Kleberf65/VerticalSeekbar.svg)](https://jitpack.io/#Kleberf65/VerticalSeekbar/1.0.0) [![Svg](https://jitpack.io/v/Kleberf65/VerticalSeekbar/month.svg)](https://jitpack.io/v/Kleberf65/VerticalSeekbar) 
Simple library to use a fully customizable vertical seekbar
## Screenshot
![image](https://user-images.githubusercontent.com/94382310/142255611-55a94081-774e-40c9-b510-0a2e25b7c30b.png)
## Installing
Step 1. Add the JitPack repository to your build file, Add it in your root `build.gradle` at the end of repositories or `settings.gradle` for new features Android Studio:

```gradle
// root build.gradle

allprojects {
        repositories {
            maven { url 'https://jitpack.io' }
        }
    }

// or settings.gradle for new features Android Studio

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency
```gradle
dependencies {
    implementation 'com.github.Kleberf65:VerticalSeekbar:1.0.0'
}
```
## Here we go for implementation
Add AdaptiveFrameLayout into your XML

```xml
<br.kleberf65.widget.VerticalSeekBar
        android:id="@+id/box_from_xml"
        android:layout_width="50dp"
        android:layout_height="500dp"
        android:layout_centerVertical="true"
        android:layout_marginStart="50dp"
        app:klvs_backgroundColor="@color/colorBackground"
        app:klvs_cornerRadius="16"
        app:klvs_max="100"
        app:klvs_progress="50"
        app:klvs_progressColor="@color/purple_200"
        app:klvs_steep="1" />
```
Set attributes AdaptiveFrameLayout programatically

```java
   VerticalSeekBar seekBarCode = findViewById(R.id.box_from_code);
        seekBarCode.setProgressColor(Color.RED);
        seekBarCode.setBackgroundColor(Color.DKGRAY);
        seekBarCode.setMax(100);
        seekBarCode.setProgress(50);
        seekBarCode.setStep(1);
        seekBarCode.setCornerRadius(16);
        seekBarCode.setEnabled(true);
        seekBarCode.setTouchEnabled(true);

        seekBarCode.setOnBoxedPointsChangeListener(new VerticalSeekBar.OnValuesChangeListener() {
            @Override
            public void onPointsChanged(VerticalSeekBar seekBar, int progress) {
                //textProgress.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(VerticalSeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(VerticalSeekBar seekBar) {

            }
        });
```
## Custom Attributes
| Command        | Description           
| ------------- |:-------------:|
| `klvs_progressColor`     | Set a progress color |
| `klvs_backgroundColor`      | Set a background color      |
| `klvs_cornerRadius` | Sets to rounded edges      |
| `klvs_progress` | Sets initial progress      |
| `klvs_steep` | Sets the increment or decrement margin as you slide      |
| `klvs_max` | Sets the maximum value      |
| `klvs_enabled` | Defines whether the will be adjustable or not      |
| `klvs_touchEnabled` | Defines if the container has to use all available width      |
