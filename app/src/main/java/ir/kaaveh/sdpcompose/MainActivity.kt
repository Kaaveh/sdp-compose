package ir.kaaveh.sdpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ir.kaaveh.sdpcompose.ui.theme.SDPComposeTheme
import ir.kaaveh.sdpcompose.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SDPComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

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

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SDPComposeTheme {
        Greeting("Android")
    }
}