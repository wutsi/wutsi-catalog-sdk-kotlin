package com.wutsi.ecommerce.catalog.dto

import java.time.OffsetDateTime
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class Product(
  public val id: Long = 0,
  public val accountId: Long = 0,
  public val thumbnail: PictureSummary? = null,
  public val pictures: List<PictureSummary> = emptyList(),
  public val category: CategorySummary = CategorySummary(),
  public val subCategory: CategorySummary = CategorySummary(),
  public val title: String = "",
  public val summary: String? = null,
  public val description: String? = null,
  public val price: Double? = null,
  public val comparablePrice: Double? = null,
  public val currency: String = "",
  public val visible: Boolean = false,
  public val quantity: Int = 0,
  public val maxOrder: Int? = null,
  public val type: String = "",
  public val created: OffsetDateTime = OffsetDateTime.now(),
  public val updated: OffsetDateTime = OffsetDateTime.now(),
  public val numericFileUrl: String? = null,
  public val sections: List<SectionSummary> = emptyList(),
  public val status: String = "",
  public val published: OffsetDateTime? = null,
  public val overallMetrics: Metrics = Metrics()
)
