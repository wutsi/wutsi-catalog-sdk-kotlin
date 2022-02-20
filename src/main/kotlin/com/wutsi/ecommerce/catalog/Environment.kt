package com.wutsi.ecommerce.catalog

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-catalog-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-catalog-server-prod.herokuapp.com"),
  ;
}
