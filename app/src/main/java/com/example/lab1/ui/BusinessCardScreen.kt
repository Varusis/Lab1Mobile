package com.example.lab1.ui

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab1.R
import com.example.lab1.model.BusinessCardUiState
import com.example.lab1.ui.components.ContactItem
import com.example.lab1.ui.components.MainInfoSection

@Composable
fun BusinessCardScreen(viewModel: BusinessCardViewModel = viewModel()) {
    val uiState by viewModel.uiState.collectAsState()

    val configuration = LocalConfiguration.current

    val isExpandedScreen = configuration.screenWidthDp >= 600 ||
            configuration.orientation == Configuration.ORIENTATION_LANDSCAPE

    if (isExpandedScreen) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_standard)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            MainInfoSection(uiState.fullName, uiState.groupInfo, uiState.avatarRes)
            ContactBlock(uiState)
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(dimensionResource(R.dimen.padding_standard)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            MainInfoSection(uiState.fullName, uiState.groupInfo, uiState.avatarRes)
            ContactBlock(uiState)
        }
    }
}
@Composable
private fun ContactBlock(uiState: BusinessCardUiState) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start
    ) {
        ContactItem(
            icon = Icons.Default.Phone,
            text = stringResource(uiState.phoneNumber)
        )
        ContactItem(
            icon = Icons.Default.Email,
            text = stringResource(uiState.email)
        )
        ContactItem(
            icon = Icons.Default.Send,
            text = stringResource(uiState.telegram)
        )
    }
}