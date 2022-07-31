# sorting time complexity O(nlogn) + O(n*n).O(nlogn) and O(n*n) bcoz we are checking to the right of each index which is a nested loop
# space complexity : O(n) bcoz we're using new list

class Solution:
    def merge(self, intervals):

        # sort the input array
        intervals.sort()

        # declare answer list
        ans = []

        # declare length of i/p
        n = len(intervals)

        # run a for on each element of the input
        for i in range(n):

            # declare start and end
            start = intervals[i][0]
            end = intervals[i][1]

            # check if o/p is not zero
            if len(ans) != 0:
                # check if start is less than the last interval's first value
                if start <= ans[-1][1]:
                    continue

            # check intervals lying ahead of present
            for j in range(i+1, n):
                if intervals[j][0] <= end:
                    end = max(end, intervals[j][1])

            end = max(end, intervals[i][1])
            ans.append([start, end])

        return ans

test = [[1,3],[2,6],[8,10],[15,18]]
sol = Solution()
print(sol.merge(test))

