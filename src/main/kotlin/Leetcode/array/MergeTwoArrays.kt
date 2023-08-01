package leetcode.array

fun main(args: Array<String>) {
    val products = listOf<Int>(1, 2, 3, 4, 5)
    val quantities = listOf<Int>(2, 5, 15, 55, 4)
    print(getPrice(products, quantities))
}

/*
@productIds list of Product Ids
@quantities list of all product quantities
return total price
*/

fun getPrice(productIds: List<Int>, quantities: List<Int>): Int {
    var totalPrice = 0
    productIds.forEachIndexed { index, prodId ->
        val prodQuantity = quantities[index]
        val pricePerItem = getPerItemPrice(prodQuantity)
        totalPrice += (pricePerItem * prodQuantity)
    }
    if (totalPrice > 100) { //if price is discountable
        val tenPercent = (10 * totalPrice) / 100
        totalPrice -= tenPercent
    }
    return totalPrice
}

fun getPerItemPrice(quantity: Int): Int {
    return when {
        quantity < 10 -> 10
        quantity in 11..49 -> 9
        else -> 8
    }
}

fun getPriceTest() {
    val products = listOf<Int>(1, 2, 3, 4, 5)
    val quantities = listOf<Int>(2, 5, 15, 55, 4)
    val expected = 617
    val actual = getPrice(products, quantities)

}
