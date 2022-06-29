package com.app.apptest.domain

import com.fasterxml.jackson.annotation.JsonAlias
import com.google.gson.annotations.SerializedName


data class Results (

  @SerializedName("name") var name : Name? = Name(),
  @SerializedName("gender") var gender : String?= null,
  @SerializedName("location")
  @JsonAlias("location")
  var address : Address? = Address(),
  @SerializedName("email") var email : String? = null,
  @SerializedName("phone") var phone : String? = null,
  @SerializedName("cell") var cell : String? = null

  )