package com.wutsi.platform.catalog.dto

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.collections.List

public data class SearchProductRequest(
  public val ids: List<Long> = emptyList(),
  public val visible: Boolean? = null,
  public val limit: Int = 30,
  public val offset: Int = 0
)
