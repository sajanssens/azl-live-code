package org.example.ch1

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class Ch1KtTest {

    @Test
    fun som() {
        val som = som(1, 2)
        assertEquals(som, 3)
    }

    @Test
    fun som2() {
        val som = som2(33, 44)
        assertEquals(som, 77)
    }
}
