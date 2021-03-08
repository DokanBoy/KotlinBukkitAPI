package br.com.devsrsouza.kotlinbukkitapi.utils.time

import kotlin.time.Duration
import kotlin.time.ExperimentalTime
import kotlin.time.milliseconds

fun now(): Long = System.currentTimeMillis()
fun nowNano(): Long = System.nanoTime()

@ExperimentalTime
val Long.ticks: Duration
    get() = toDouble().ticks

@ExperimentalTime
val Int.ticks: Duration
    get() = toDouble().ticks

@ExperimentalTime
val Double.ticks: Duration
    get() = tickToMilliseconds(this).milliseconds

@ExperimentalTime
val Duration.inTicks: Double
    get() = millisecondsToTick(inMilliseconds)

@ExperimentalTime
fun Duration.toLongTicks(): Long = inTicks.toLong()

private fun tickToMilliseconds(value: Double): Double = value * 50.0
private fun millisecondsToTick(value: Double): Double = value / 50.0