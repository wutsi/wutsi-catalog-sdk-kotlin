package com.wutsi.platform.catalog.dto

import kotlin.Double
import kotlin.Long
import kotlin.String

public data class UpdateProductRequest(
  public val title: String = "",
  public val summary: String = "",
  public val description: String? = null,
  public val categoryId: Long = 0,
  public val price: Double? = null,
  public val comparablePrice: Double? = null
)
