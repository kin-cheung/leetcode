/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
        fun longestLeg(root: TreeNode?) : Int {
            if (root == null) return 0
            return Math.max ( longestLeg(root?.left), longestLeg(root?.right )) + 1
        }

        fun diameterOfBinaryTree(root: TreeNode?): Int {
            if (root == null) return 0
            val legMax = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right))
            val left = longestLeg(root?.left)
            val right = longestLeg(root?.right )
            val rootMax = left + right
            return Math.max(rootMax, legMax)
        }
}