/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class MinStack() {
    private class Node(val value: Int, val min: Int)

    /** initialize your data structure here. */
    private val stack = mutableListOf<Node>()

    fun push(x: Int)  = stack.add(Node(x, if (stack.isEmpty()) x else Math.min(x, getMin())))

    fun pop() = stack.removeAt(stack.lastIndex).value

    fun top() = stack.last().value

    fun getMin() = stack.last().min
}