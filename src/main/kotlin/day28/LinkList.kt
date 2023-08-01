package day28

data class Node<T>(val data: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next == null) {
            data.toString()
        } else {
            data.toString() + "->" + next.toString()
        }

    }
}

class LinkList<T> : MutableCollection<T> {
    override fun toString(): String {
        return head.toString()
    }

    var head: Node<T>? = null
    override var size: Int = 0
        private set

    override fun clear() {
        size = 0
        head = null
    }

    override fun add(element: T): Boolean {
        val newNode = Node(element)
        if (head == null) {
            head = newNode
        } else {
            var last: Node<T> = head!!
            while (last.next != null) {
                last = last.next!!
            }
            last.next = newNode
        }
        size++
        return true
    }

    override fun addAll(elements: Collection<T>): Boolean {
        for (ele in elements) {
            add(ele)
        }
        return true
    }


    override fun isEmpty(): Boolean {
        return size == 0
    }

    override fun iterator(): MutableIterator<T> {
        return LinkedListIterator(this)
    }

    override fun retainAll(elements: Collection<T>): Boolean {
        var result = false
        val iterator = this.iterator()
        while (iterator.hasNext()) {
            val ele = iterator.next()
            if (!elements.contains(ele)) {
                remove(ele)
                result = true
            }
        }
        return result
    }


    override fun remove(element: T): Boolean {
        if (element == head?.data) {
            head = head?.next
            size--
            return true
        } else {
            var result = false
            var current = head
            var prev = current
            while (current != null) {
                if (current.data == element) {
                    prev?.next = current.next
                    result = true
                    size--
                    break
                } else {
                    prev = current
                    current = current.next
                }
            }
            return result
        }

    }

    fun removeAt(position: Int): Boolean {
        if (position < 0 || position > size - 1) {
            return false
        }

        if (position == 0) {
            head = head?.next
            size--
        } else {
            var current = head
            var prev = current
            var index = 0;
            while (current != null) {
                if (index == position) {
                    prev?.next = current.next
                    size--
                    break
                } else {
                    index++
                    prev = current
                    current = current.next
                }
            }
            return current != null
        }
        return false
    }

    override fun removeAll(elements: Collection<T>): Boolean {
        var result = false
        for (ele in elements) {
            result = remove(ele) || result
        }
        return result
    }

    fun addAt(position: Int, element: T): Boolean {
        var current = head
        val newNode = Node(element)
        if (position == 0) {
            newNode.next = head
            head = newNode
            size++
            return true
        } else {
            var prev = current
            var index = 0;
            var result = false
            while (current != null) {
                if (position == index) {
                    prev?.next = newNode
                    newNode.next = current
                    result = true
                    size++
                    break
                }
                index++
                prev = current
                current = current.next
            }
            return result
        }
    }

    fun getAt(position: Int): T? {
        if (position < 0 || position > size - 1) {
            return null
        } else {
            var index = 0
            var current = head
            while (index != position) {
                current = current?.next
                index++
            }
            return current?.data
        }

    }


    override fun contains(element: T): Boolean {
        var current = head
        var result = false
        while (current != null) {
            if (current.data == element) {
                result = true
                break
            }
            current = current.next
        }
        return result
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        for (ele in elements) {
            if (!contains(ele)) return false
        }
        return true
    }


}

class LinkedListIterator<T>(linkList: LinkList<T>) : MutableIterator<T> {
    private var current = linkList.head
    private var prev = linkList.head
    override fun hasNext(): Boolean {
        return current != null
    }

    override fun next(): T {
        val data = current!!.data
        prev = current
        current = current!!.next
        return data
    }

    override fun remove() {
        prev?.next = current?.next
    }
}

fun main(args: Array<String>) {
    val linkList = LinkList<Int>()
    val list = listOf(1, 2, 3, 4, 5)
    val retain = listOf(2, 4)
    linkList.addAll(list)
    linkList.retainAll(retain)
    println(linkList.toString())
}