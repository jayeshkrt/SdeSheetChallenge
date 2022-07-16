class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        min_price = 100000
        max_price = 0
        for i in range(len(prices)):
            if min_price > prices[i]:
                min_price = prices[i]
            max_price = max(max_price, prices[i] - min_price)
        return max_price
