package com.wutsi.platform.catalog.dto

import kotlin.Double
import kotlin.Long
import kotlin.String

public data class CreateProductRequest(
  public val title: String = "",
  public val summary: String? = null,
  public val description: String? = null,
  public val categoryId: Long? = null,
  public val price: Double? = null,
  public val comparablePrice: Double? = null
)
