package com.example.firstappfinish.database

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.firstappfinish.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding: FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}
