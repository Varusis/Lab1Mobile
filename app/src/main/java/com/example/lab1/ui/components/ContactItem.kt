package com.example.lab1.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import com.example.lab1.R
import com.example.lab1.ui.theme.spResource

@Composable
fun ContactItem(icon: ImageVector, text: String, modifier: Modifier = Modifier) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(vertical = dimensionResource(R.dimen.spacer_small))
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = colorResource(R.color.icon_tint),
            modifier = Modifier.size(dimensionResource(R.dimen.icon_size))
        )
        Spacer(modifier = Modifier.width(dimensionResource(R.dimen.spacer_large)))
        Text(
            text = text,
            fontSize = spResource(R.dimen.font_info),
            color = colorResource(R.color.text_primary)
        )
    }
}