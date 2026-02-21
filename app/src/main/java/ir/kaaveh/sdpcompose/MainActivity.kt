package ir.kaaveh.sdpcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ir.kaaveh.sdpcompose.ui.theme.SDPComposeTheme
import ir.kaaveh.sdpcompose.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SDPComposeTheme {
                Scaffold { innerPadding ->
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                    ) {
                        Greeting(
                            name = "Android",
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    name: String = "Android",
) {
    Text(
        text = "Hello $name!",
        color = Color.White,
        fontSize = 16.ssp,
        modifier = modifier
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
        Greeting(name = "Android")
    }
}
