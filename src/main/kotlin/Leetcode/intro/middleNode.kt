package leetcode.intro


fun main(args: Array<String>) {
    val node1 = ListNode(1)
    val node2 = ListNode(2)
    val node3 = ListNode(3)
    val node4 = ListNode(4)
    val node5 = ListNode(5)
    node1.next = node2
    node2.next = node3
    node3.next = node4
    node4.next = node5
    println(middleNode(node1))
}

fun middleNode(head: ListNode?): ListNode? {
    var p1 = head
    var p2 = head
    while (p2?.next != null) {
        p1 = p1?.next
        p2 = p2.next?.next
    }
    return p1
}


class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        return if (next != null) {
            `val`.toString() + " -> " + next.toString()
        } else {
            `val`.toString()
        }
    }
}