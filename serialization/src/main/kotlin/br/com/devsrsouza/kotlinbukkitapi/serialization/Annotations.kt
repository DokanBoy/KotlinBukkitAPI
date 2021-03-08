package br.com.devsrsouza.kotlinbukkitapi.serialization

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialInfo

/**
 * Annotation used to automatically translate color codes from the configuration texts
 * when using Kotlinx.serialization and KotlinBukkitAPI [SerializtionConfig] ([KotlinPlugin.config]).
 */
@SerialInfo
@ExperimentalSerializationApi
@Target(AnnotationTarget.PROPERTY)
annotation class ChangeColor