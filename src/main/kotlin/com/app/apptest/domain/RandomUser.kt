package com.app.apptest.domain

import com.google.gson.annotations.SerializedName


data class RandomUser (

  @SerializedName("results" ) var results : ArrayList<Results> = arrayListOf(),

)