package com.example.genetica.models

data class Document(
    val id: String,
    val userId: String, // ID of the user this document belongs to
    val documentName: String,
    val documentUrl: String // URL or resource ID for the document
)
