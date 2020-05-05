class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
            val heap = java.util.PriorityQueue<Int>(java.util.Collections.reverseOrder())

            for (stone in stones) {
                heap.add(stone)
            }

            while (heap.size > 1) {
                val y = heap.poll()
                val x = heap.poll()
                if (y > x)
                    heap.add(y - x)
            }
            return if (heap.isEmpty()) 0 else heap.poll()
    }
}