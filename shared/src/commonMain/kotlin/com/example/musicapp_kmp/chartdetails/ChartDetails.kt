package com.example.musicapp_kmp.chartdetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.seiko.imageloader.rememberAsyncImagePainter


/**
 * Created by abdulbasit on 28/02/2023.
 */
@Composable
internal fun ChartDetailsScreen(viewModel: ChartDetailsViewModel) {
    ChartDetailsView()
}

@Composable
internal fun ChartDetailsView() {
    Box(modifier = Modifier.fillMaxSize()) {
        val painter =
            rememberAsyncImagePainter("https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg")
        Image(
            painter,
            "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier.fillMaxSize().background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0x501A1E1F), Color(0xFF1E1E1E)
                    )
                )
            )
        )
    }
    Column(modifier = Modifier.padding(horizontal = 24.dp)) {
        val painter =
            rememberAsyncImagePainter("https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg")
        Image(
            painter = painter,
            contentDescription = "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg",
            modifier = Modifier.padding(top = 24.dp, end = 24.dp, bottom = 24.dp).fillMaxWidth().aspectRatio(1f)
                .clip(RoundedCornerShape(25.dp)),
            contentScale = ContentScale.Crop,
        )
        Text(text = "Tomorrow’s tunes", style = MaterialTheme.typography.h4.copy(color = Color(0XFFA4C7C6)))
        Text(
            text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit ut aliquam, purus sit amet luctus venenatis",
            style = MaterialTheme.typography.body2.copy(color = Color(0XFFEFEEE0)),
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = "64 songs ~ 16 hrs+",
            style = MaterialTheme.typography.body2.copy(color = Color(0XFFEFEEE0)),
            modifier = Modifier.padding(top = 8.dp)
        )
        OptionChips()
        PlayList()
    }
}


@Composable
internal fun PlayList() {
    val listState = rememberLazyListState()
    LazyColumn(
        modifier = Modifier.padding(top = 25.dp).fillMaxWidth(),
        state = listState,
        verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        items(items = listOf(1, 2)) {
            Box(
                modifier = Modifier.clip(RoundedCornerShape(20.dp)).fillMaxWidth().background(Color(0xFF33373B))
                    .padding(16.dp)
            ) {
                Row(modifier = Modifier.fillMaxWidth()) {
                    val painter =
                        rememberAsyncImagePainter("https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg")
                    Image(
                        painter,
                        "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg",
                        modifier = Modifier.clip(RoundedCornerShape(5.dp)).width(40.dp).height(40.dp),
                        contentScale = ContentScale.Crop
                    )
                    Column(Modifier.weight(1f).padding(start = 8.dp).align(Alignment.Top)) {
                        Text(
                            text = "Let me love you ~ Krisx",
                            style = MaterialTheme.typography.caption.copy(color = Color(0XFFEFEEE0))
                        )
                        Text(
                            text = "Let me love you ~ Krisx",
                            style = MaterialTheme.typography.caption.copy(color = Color(0XFFEFEEE0)),
                            modifier = Modifier.padding(top = 8.dp)
                        )
                    }
                    Text(
                        text = "s",
                        style = MaterialTheme.typography.caption.copy(color = Color(0XFFEFEEE0)),
                        modifier = Modifier.align(
                            Alignment.Bottom
                        )
                    )
                }
            }
        }
    }
}

@Composable
internal fun OptionChips() {
    Box(
        modifier = Modifier.padding(top = 25.dp).clip(RoundedCornerShape(32.dp)).background(Color(0xFF33373B))
            .padding(16.dp)
    ) {
        Row {
            Icon(
                imageVector = Icons.Default.PlayArrow,
                tint = Color(0xFFFACD66),
                contentDescription = "Explore details",
                modifier = Modifier.padding(end = 8.dp).size(16.dp).align(Alignment.CenterVertically)
            )
            Text(text = "Play All", style = MaterialTheme.typography.caption.copy(color = Color(0XFFEFEEE0)))
        }
    }
}