package leetcode.array

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

  class MergeTwoArraysKtTest {

    @Test
    fun getPriceTest() {
        val products = listOf<Int>(1, 2, 3, 4, 5)
        val quantities = listOf<Int>(2, 5, 15, 55, 4)
        val expected = 617
        val actual = getPrice(products, quantities)
        assertTrue(expected == actual)
    }


}