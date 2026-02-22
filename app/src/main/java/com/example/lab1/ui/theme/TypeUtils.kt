package com.example.lab1.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.TextUnit

@Composable
fun spResource(id: Int): TextUnit {
    return with(LocalDensity.current) {
        dimensionResource(id).toSp()
    }
}