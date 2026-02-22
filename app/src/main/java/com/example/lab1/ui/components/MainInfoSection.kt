package com.example.lab1.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.example.lab1.R
import com.example.lab1.ui.theme.spResource

@Composable
fun MainInfoSection(fullName: Int, groupInfo: Int, avatarRes: Int) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = avatarRes),
            contentDescription = null,
            modifier = Modifier
                .size(dimensionResource(R.dimen.avatar_size))
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(fullName),
            fontSize = spResource(R.dimen.font_name),
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.text_primary)
        )
        Text(
            text = stringResource(groupInfo),
            fontSize = spResource(R.dimen.font_info),
            color = colorResource(R.color.text_primary)
        )
    }
}