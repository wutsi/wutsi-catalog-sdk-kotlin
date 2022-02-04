package com.wutsi.platform.catalog

import com.wutsi.platform.catalog.dto.AddCategoryRequest
import com.wutsi.platform.catalog.dto.AddPictureRequest
import com.wutsi.platform.catalog.dto.AddPictureResponse
import com.wutsi.platform.catalog.dto.CreateCategoryRequest
import com.wutsi.platform.catalog.dto.CreateCategoryResponse
import com.wutsi.platform.catalog.dto.CreateProductRequest
import com.wutsi.platform.catalog.dto.CreateProductResponse
import com.wutsi.platform.catalog.dto.GetCategoryResponse
import com.wutsi.platform.catalog.dto.GetProductResponse
import com.wutsi.platform.catalog.dto.SearchCategoryRequest
import com.wutsi.platform.catalog.dto.SearchCategoryResponse
import com.wutsi.platform.catalog.dto.SearchProductRequest
import com.wutsi.platform.catalog.dto.SearchProductResponse
import com.wutsi.platform.catalog.dto.UpdateCategoryRequest
import com.wutsi.platform.catalog.dto.UpdateProductAttributeRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
import kotlin.Unit

public interface WutsiCatalogApi {
  @RequestLine("POST /v1/categories")
  @Headers(value=["Content-Type: application/json"])
  public fun createCategory(request: CreateCategoryRequest): CreateCategoryResponse

  @RequestLine("POST /v1/categories/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchCategories(request: SearchCategoryRequest): SearchCategoryResponse

  @RequestLine("GET /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getCategory(@Param("id") id: Long): GetCategoryResponse

  @RequestLine("POST /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateCategory(@Param("id") id: Long, request: UpdateCategoryRequest): Unit

  @RequestLine("DELETE /v1/categories/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deleteCategory(@Param("id") id: Long): Unit

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

  @RequestLine("POST /v1/products/{id}/categories")
  @Headers(value=["Content-Type: application/json"])
  public fun addCategory(@Param("id") id: Long, request: AddCategoryRequest): Unit

  @RequestLine("DELETE /v1/products/{id}/categories/{category-id}")
  @Headers(value=["Content-Type: application/json"])
  public fun removeCategory(@Param("id") id: Long, @Param("category-id") categoryId: Long): Unit
}
