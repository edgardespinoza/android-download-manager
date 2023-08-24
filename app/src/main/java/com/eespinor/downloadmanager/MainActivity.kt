package com.eespinor.downloadmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.eespinor.downloadmanager.ui.theme.DownloadManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val downloader = AndroidDownloader(this)

        downloader.downloadFile("https://pl-coding.com/wp-content/uploads/2022/04/pic-squared.jpg")

        super.onCreate(savedInstanceState)
        setContent {
            DownloadManagerTheme {

            }
        }
    }
}