package day28

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.lang.reflect.Executable

internal class LinkListTest {

    @Test
    fun add() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        assertEquals(linkList.size, 2)
    }

    @Test
    fun clear() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        linkList.clear()
        assertEquals(linkList.size, 0)
    }

    @Test
    fun addAll() {
        val linkList = LinkList<Int>()
        val list = listOf(1, 2, 3, 4, 5)
        linkList.addAll(list)
        assertTrue(linkList.size == list.size)
    }

    @Test
    fun retainAll() {
        val linkList = LinkList<Int>()
        val list = listOf(1, 2, 3, 4, 5)
        val retain = listOf(2, 4)
        linkList.addAll(list)
        linkList.retainAll(retain)
        assertTrue(linkList.size == retain.size)
    }

    @Test
    fun remove() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        linkList.add(3)
        linkList.remove(3)
        assertFalse(linkList.contains(3))
    }

    @Test
    fun removeAt() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        linkList.add(3)
        linkList.removeAt(0)
        assertFalse(linkList.contains(1))
    }


    @Test
    fun addAt() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        linkList.add(3)
        linkList.addAt(2, 15)
        assertTrue(linkList.getAt(2) == 15)
    }

    @Test
    fun getAt() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        linkList.add(3)
        assertTrue(linkList.getAt(1) == 2)
    }

    @Test
    fun contains() {
        val linkList = LinkList<Int>()
        linkList.add(1)
        linkList.add(2)
        linkList.add(3)
        assertTrue(linkList.contains(3))
    }


}