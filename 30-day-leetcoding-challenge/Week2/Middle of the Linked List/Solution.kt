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

    fun middleNode(head: ListNode?): ListNode? {
        var mid = head
        var cur = head
        var i = 1
        var midIndx = i
        while (cur?.next != null) {
            cur = cur.next
            i += 1
            while ((i / 2) + 1 > midIndx) {
                midIndx += 1
                mid = mid?.next
            }
        }

        return mid
    }
}