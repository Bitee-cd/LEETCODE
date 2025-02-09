def rotate(self, matrix):
    n = len(matrix)

    # **Transpose the matrix**
    for i in range(n):
        for j in range(i, n):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

    # **Horizontal Flip**
    for row in matrix:
        row.reverse()  
