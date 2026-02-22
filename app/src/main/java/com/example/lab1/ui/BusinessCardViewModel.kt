package com.example.lab1.ui

import androidx.lifecycle.ViewModel
import com.example.lab1.R
import com.example.lab1.model.BusinessCardUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class BusinessCardViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(
        BusinessCardUiState(
            fullName = R.string.full_name,
            groupInfo = R.string.group_info,
            phoneNumber = R.string.phone_val,
            email = R.string.email_val,
            telegram = R.string.tg_val,
            avatarRes = R.drawable.avatar
        )
    )
    val uiState: StateFlow<BusinessCardUiState> = _uiState.asStateFlow()
}