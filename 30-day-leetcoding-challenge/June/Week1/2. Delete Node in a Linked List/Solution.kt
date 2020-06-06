/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
	fun deleteNode(node: ListNode?) {
		var n = node
		while(n?.next?.next != null) {
			n.`val` = n.next!!.`val`
			n = n.next
		}
		n?.`val` = n?.next!!.`val`
		n?.next = null
	}
}