/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.mrcat

import android.os.Bundle
import android.provider.Settings.Global.getString
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mrcat.ui.theme.MrCatTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MrCatTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(getString(R.string.hello),
                        getString(R.string.name))
                }
            }
        }
    }
}

@Composable
fun Greeting(hello: String, name: String) {
    val image = painterResource(R.drawable._01)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentScale = ContentScale.Crop
    )
    Text(
        text = "$hello $name!",
        fontSize = 36.sp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth(Alignment.CenterHorizontally)
            .padding(top = 30.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MrCatTheme {
        Greeting(stringResource(R.string.hello),
            stringResource(R.string.name))
    }
}