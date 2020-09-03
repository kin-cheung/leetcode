class Solution {
	fun repeatedSubstringPattern(s: String): Boolean {
		var ssSize = 1

		while (ssSize <= s.length / 2) {
			if (s.length % ssSize == 0) {
				var i = ssSize
				val ss = s.substring(0, ssSize)
				while (i < s.length) {
					if (ss != s.substring(i, i + ssSize)) break
					else if (i + ssSize == s.length) return true
					i += ssSize
				}
			}
			ssSize ++
		}

		return false
	}
}