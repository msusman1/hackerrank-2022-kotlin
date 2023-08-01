package day26

fun main(args: Array<String>) {
    val hashSet = MyHashSet()
    hashSet.add(1)
    hashSet.add(2)
    hashSet.contains(2)
    hashSet.contains(3)
    hashSet.add(2)
    hashSet.contains(2)
    hashSet.remove(2)
    println(hashSet.contains(2))
}

class MyHashSet() {
    private val NO_OF_BUCKETS = 100_000  //no of buckets

    private val set: Array<MutableList<Int>?> = arrayOfNulls(NO_OF_BUCKETS)

    private fun getBucketIndex(key: Int): Int {
        return key % NO_OF_BUCKETS
    }


    fun add(key: Int) {
        val bucketIndex = getBucketIndex(key)
        if (set[bucketIndex] == null) {
            set[bucketIndex] = mutableListOf()
        }
        if (set[bucketIndex]!!.contains(key).not()) {
            set[bucketIndex]!!.add(key)
        }
    }

    fun remove(key: Int) {
        val bucketIndex = getBucketIndex(key)
        set[bucketIndex]?.remove(key)
    }

    fun contains(key: Int): Boolean {
        val bucketIndex = getBucketIndex(key)
        return set[bucketIndex]?.contains(key) ?: false
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */