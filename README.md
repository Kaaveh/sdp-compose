# SDP-Compose: a scalable size unit for Jetpack Compose

Did you miss [SDP](https://github.com/intuit/sdp) library from XML world? SDP-Compose bring to you SDP in your Jetpack Compose project.

Bonouce tip: You don't need [SSP](https://github.com/intuit/ssp) library, SDP-Compose have it too!

# Usage


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

# Setup
