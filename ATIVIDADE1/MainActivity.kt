package com.example.meuprimeiroprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(modifier = Modifier.padding(16.dp)) {

                MessageCard(
                    Message("Cacá", "oi", R.drawable._snoopy)
                )

                Spacer(modifier = Modifier.height(16.dp))

                MessageCard(
                    Message("Drax", "tudo bem", R.drawable.cachorrinho)
                )

                Spacer(modifier = Modifier.height(16.dp))

                MessageCard(
                    Message("Snoopy", "bem vindo", R.drawable.cao2)
                )
            }
        }
    }
}

data class Message(
    val author: String,
    val body: String,
    val image: Int
)

@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(all = 8.dp)) {

        Image(
            painter = painterResource(msg.image),
            contentDescription = "Foto de perfil",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {

            Text(text = msg.author)

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = msg.body)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMessageCard() {

    Column(modifier = Modifier.padding(16.dp)) {

        MessageCard(
            Message("Snoopy", "Oi!", R.drawable._snoopy)
        )

        Spacer(modifier = Modifier.height(16.dp))

        MessageCard(
            Message("Drax", "Tudo bem?", R.drawable.cachorrinho)
        )

        Spacer(modifier = Modifier.height(16.dp))

        MessageCard(
            Message("Cacá", "Bem-vindo!", R.drawable.cao2)
        )
    }
}
