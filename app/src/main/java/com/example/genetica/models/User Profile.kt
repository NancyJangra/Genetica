package com.example.genetica.models

data class UserProfile(
    val id: String,
    val name: String,
    val age: Int,
    val medicalHistory: String,
    val profileImage: String // URL or resource ID for the profile image
)