class Solution(w: IntArray) {
	private val weights = w
	private var sum = 0

	init {
		// pre-processing. e.g. turn [5,2,1,3,4] to [5,7,8,11,15]
		var runningSum = 0
		for ( (i, v) in weights.withIndex() ) {
			runningSum += v
			weights[i] = runningSum
		}
		sum = runningSum
	}

	fun pickIndex(): Int {
		val random = kotlin.random.Random.nextInt(sum)
		var selectedIndex = 0
		while (weights[selectedIndex++] <= random){}
		return selectedIndex - 1
	}
}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(w)
 * var param_1 = obj.pickIndex()
 */