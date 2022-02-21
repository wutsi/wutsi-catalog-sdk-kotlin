package com.wutsi.ecommerce.catalog

import com.wutsi.ecommerce.catalog.dto.AddPictureRequest
import com.wutsi.ecommerce.catalog.dto.AddPictureResponse
import com.wutsi.ecommerce.catalog.dto.CreateProductRequest
import com.wutsi.ecommerce.catalog.dto.CreateProductResponse
import com.wutsi.ecommerce.catalog.dto.CreateReservationRequest
import com.wutsi.ecommerce.catalog.dto.CreateReservationResponse
import com.wutsi.ecommerce.catalog.dto.GetCategoryResponse
import com.wutsi.ecommerce.catalog.dto.GetProductResponse
import com.wutsi.ecommerce.catalog.dto.SearchCategoryRequest
import com.wutsi.ecommerce.catalog.dto.SearchCategoryResponse
import com.wutsi.ecommerce.catalog.dto.SearchProductRequest
import com.wutsi.ecommerce.catalog.dto.SearchProductResponse
import com.wutsi.ecommerce.catalog.dto.UpdateProductAttributeRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiCatalogApi {
  @RequestLine("POST /v1/categories/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchCategories(request: SearchCategoryRequest): SearchCategoryResponse

  @RequestLine("GET /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getCategory(@Param("id") id: Long): GetCategoryResponse

  @RequestLine("POST /v1/products")
  @Headers(value=["Content-Type: application/json"])
  public fun createProduct(request: CreateProductRequest): CreateProductResponse

  @RequestLine("POST /v1/products/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchProducts(request: SearchProductRequest): SearchProductResponse

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

  @RequestLine("POST /v1/reservations")
  @Headers(value=["Content-Type: application/json"])
  public fun createReservation(request: CreateReservationRequest): CreateReservationResponse

  @RequestLine("POST /v1/reservations/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun cancelReservation(@Param("id") id: Long): Unit
}
