class Solution {
	fun productExceptSelf(nums: IntArray): IntArray {
		// 2 x N array.
		// Pad an extra element to both sides to avoid range check in the final step
		// 0: running products from left to right
		// 1: running products from right to left
		val cache = Array<IntArray>(2) { IntArray(nums.size + 2) { 1 } }

		// populate cache[0]
		var i = 1
		for (num in nums ) {
			cache[0][i] = num * cache[0][i - 1]
			i ++
		}

		// populate cache[1]
		i = nums.size
		for (num in nums.reversed()) {
			cache[1][i] = num * cache[1][i + 1]
			i --
		}

		// for each element, cache[0][n-1] * cache[1][n+1]
		return nums.mapIndexed { index, _ -> cache[0][index] * cache[1][index + 2]}.toIntArray()
	}
}