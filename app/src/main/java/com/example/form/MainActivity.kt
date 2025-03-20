package com.example.form

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.form.ui.theme.FormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FormTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    formApp()
                }
            }
        }
    }
}

@Composable
fun formApp() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Fit
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Text(
                text = stringResource(R.string.titulo),
                fontSize = 26.sp,
                modifier = Modifier.padding(16.dp)
            )
        }

        Row {
            Text(
                text = stringResource(R.string.paragrafo_um),
                fontSize = 16.sp,
                modifier = Modifier.padding(16.dp),
                textAlign = Justify
            )
        }

        Row {
            Text(
                text = stringResource(R.string.paragrafo_dois),
                fontSize = 16.sp,
                modifier = Modifier.padding(16.dp),
                textAlign = Justify
            )
        }
    }
}

@Preview(
    showBackground = true,
    device = "spec:width=411dp,height=891dp",
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    formApp()
}