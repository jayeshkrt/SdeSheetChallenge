class Solution(object):
    def rotate(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        # 2 steps
        
        # Step 1: transpose the matrix
        # Step 2: reverse all the columns
        
        # Step 1
        n = len(matrix)
        for i in range(n):
            # note that i is written in the below loop
            for j in range(i):
                temp = matrix[i][j] 
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
        
        
        # Step 2
        for row in matrix:
            row.reverse()
        
        return matrix
