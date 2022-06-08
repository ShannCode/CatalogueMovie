package com.shanncode.cataloguemovie

import com.google.gson.annotations.SerializedName


data class MovieResponse(
    @SerializedName("results")
    val result : List<Result>
)