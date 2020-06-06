    class Solution {
        fun countElements(arr: IntArray): Int {
            var answer = 0
            if (arr.isEmpty()) return answer
            arr.sortDescending()
            val map = mutableSetOf<Int>()
            for (e in arr) {
                if (map.contains(e + 1)) {
                    answer += 1
                }
                map.add(e)
            }
            return answer
        }
    }