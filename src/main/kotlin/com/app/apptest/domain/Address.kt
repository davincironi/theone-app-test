package com.app.apptest.domain

import com.google.gson.annotations.SerializedName


data class Address (

  @SerializedName("street") var street : Street? = Street(),
  @SerializedName("city") var city : String? = null,
  @SerializedName("state") var state : String? = null,
  @SerializedName("country") var country : String? = null,
  @SerializedName("postcode") var postcode : String? = null,
  @SerializedName("coordinates") var coordinates : Coordinates? = Coordinates(),
  @SerializedName("timezone") var timezone : Timezone? = Timezone()

)