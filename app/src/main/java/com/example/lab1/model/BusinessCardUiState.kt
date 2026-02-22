package com.example.lab1.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class BusinessCardUiState(
    @StringRes val fullName: Int,
    @StringRes val groupInfo: Int,
    @StringRes val phoneNumber: Int,
    @StringRes val email: Int,
    @StringRes val telegram: Int,
    @DrawableRes val avatarRes: Int
)