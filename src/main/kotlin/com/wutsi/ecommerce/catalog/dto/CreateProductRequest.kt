package com.wutsi.ecommerce.catalog.dto

import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class CreateProductRequest(
  public val title: String = "",
  public val summary: String? = null,
  public val description: String? = null,
  public val price: Double? = null,
  public val comparablePrice: Double? = null,
  public val categoryId: Long = 0,
  public val subCategoryId: Long = 0,
  public val quantity: Int = 0,
  public val maxOrder: Int? = null,
  public val type: String = ""
)
