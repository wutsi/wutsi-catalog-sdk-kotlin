package com.wutsi.ecommerce.catalog.dto

import kotlin.Int
import kotlin.String

public data class UpdateSectionRequest(
  public val title: String = "",
  public val sortOrder: Int = 0
)
