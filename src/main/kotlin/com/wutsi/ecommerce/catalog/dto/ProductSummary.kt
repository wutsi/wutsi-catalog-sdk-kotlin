package com.wutsi.ecommerce.catalog.dto

import java.time.OffsetDateTime
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String

public data class ProductSummary(
  public val id: Long = 0,
  public val accountId: Long = 0,
  public val thumbnail: PictureSummary = PictureSummary(),
  public val title: String = "",
  public val summary: String? = null,
  public val price: Double? = null,
  public val comparablePrice: Double? = null,
  public val categoryId: Long = 0,
  public val subCategoryId: Long = 0,
  public val quantity: Int = 0,
  public val maxOrder: Int? = null,
  public val type: String = "",
  public val currency: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now()
)
