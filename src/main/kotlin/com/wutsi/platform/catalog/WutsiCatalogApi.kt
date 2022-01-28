package com.wutsi.platform.catalog

import com.wutsi.platform.catalog.dto.AddPictureRequest
import com.wutsi.platform.catalog.dto.AddPictureResponse
import com.wutsi.platform.catalog.dto.CreateProductRequest
import com.wutsi.platform.catalog.dto.CreateProductResponse
import com.wutsi.platform.catalog.dto.GetProductResponse
import com.wutsi.platform.catalog.dto.SearchProductRequest
import com.wutsi.platform.catalog.dto.SearchProductResponse
import com.wutsi.platform.catalog.dto.UpdateProductAttributeRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiCatalogApi {
  @RequestLine("POST /v1/products")
  @Headers(value=["Content-Type: application/json"])
  public fun createProduct(request: CreateProductRequest): CreateProductResponse

  @RequestLine("POST /v1/products/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchProduct(request: SearchProductRequest): SearchProductResponse

  @RequestLine("GET /v1/products/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getProduct(@Param("id") id: Long): GetProductResponse

  @RequestLine("DELETE /v1/products/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deleteProduct(@Param("id") id: Long): Unit

  @RequestLine("POST /v1/products/{id}/attributes/{name}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateProductAttribute(
    @Param("id") id: Long,
    @Param("name") name: String,
    request: UpdateProductAttributeRequest
  ): Unit

  @RequestLine("POST /v1/products/{id}/pictures")
  @Headers(value=["Content-Type: application/json"])
  public fun addPicture(@Param("id") id: Long, request: AddPictureRequest): AddPictureResponse

  @RequestLine("DELETE /v1/products/pictures/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deletePicture(@Param("id") id: Long): Unit
}
