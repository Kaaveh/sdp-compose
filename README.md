# SDP-Compose: a scalable size unit for Jetpack Compose

Do you miss [SDP](https://github.com/intuit/sdp) library from XML world? SDP-Compose bring to you SDP in your Jetpack Compose project.

Bonus: You don't need [SSP](https://github.com/intuit/ssp) library, SDP-Compose have it too!

## Usage

```Kotlin
@Preview(showBackground = true)
@Composable
fun Greeting(name: String = "Android") {
    Text(
        text = "Hello $name!",
        color = Color.White,
        fontSize = 16.ssp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.sdp)
            .clip(RoundedCornerShape(16.sdp))
            .background(Teal200)
            .padding(16.sdp),
    )
}
```

<img style="float: right;" src="https://github.com/Kaaveh/sdp-compose/blob/main/screenshots/1.png" height="200"/>

For using in non-Composable functions like in typography:
```kotlin
val TextSmall: TextStyle
    @Composable get() =
        TextStyle(
            fontFamily = yekanRegularFont,
            fontSize = 12.ssp,
        )
```

## Setup

1. Add it in your setting.gradle at the end of repositories:
```gradle
dependencyResolutionManagement {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

2. Add the dependency
```gradle
dependencies {
	implementation 'com.github.Kaaveh:sdp-compose:1.1.0'
}
```
3. Enjoy!
