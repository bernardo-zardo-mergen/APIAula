/**
 * API de Tarefas
 *
 * API para gerenciamento de tarefas
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param id 
 * @param descricao 
 * @param dataCriacao 
 * @param dataLimite 
 * @param finalizada 
 */

data class Task (

    @Json(name = "id")
    val id: kotlin.Long? = null,

    @Json(name = "descricao")
    val descricao: kotlin.String? = null,

    @Json(name = "dataCriacao")
    val dataCriacao: java.time.OffsetDateTime? = null,

    @Json(name = "dataLimite")
    val dataLimite: java.time.OffsetDateTime? = null,

    @Json(name = "finalizada")
    val finalizada: kotlin.Boolean? = null

)

