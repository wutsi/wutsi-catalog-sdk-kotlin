package com.wutsi.platform.catalog.dto

import java.time.OffsetDateTime
import kotlin.Double
import kotlin.Long
import kotlin.String

public data class ProductSummary(
  public val id: Long = 0,
  public val thumbnail: PictureSummary? = null,
  public val title: String = "",
  public val summary: String? = null,
  public val price: Double? = null,
  public val comparablePrice: Double? = null,
  public val currency: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now()
)
