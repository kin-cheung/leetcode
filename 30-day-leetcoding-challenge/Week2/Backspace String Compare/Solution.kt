class Solution {
     fun backspaceCompare(S: String, T: String): Boolean {
            var j = T.length - 1
            var sb = 0
            var tb = 0
            for (i in S.length - 1 downTo 0) {
                val s = S[i]
                if (s == '#') {
                    sb += 1
                } else {
                    if (sb > 0) {
                        sb -= 1
                    } else {
                        if (j < 0) return false

                        var t = T[j--]
                        while (t == '#') {
                            tb += 1
                            if (j < 0) return false
                            t = T[j--]

                            while (t != '#' && tb > 0) {
                                tb -= 1
                                if (j < 0) return false
                                t = T[j--]
                            }
                        }

                        if (s != t) {
                            return false
                        }
                    }
                }
            }

            while (j >= 0) {
                if (T[j--] == '#') {
                    tb += 1
                } else {
                    if (tb > 0) {
                        tb -= 1
                    } else {
                        return false
                    }
                }
            }

            return true
        }
}