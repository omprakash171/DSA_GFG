class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int col = 0; col < n; col++){
            int startRow = 0, endRow = n - 1;
            while(startRow <= endRow){
                int temp = mat[startRow][col];
                mat[startRow][col] = mat[endRow][col];
                mat[endRow][col] = temp;
                startRow++;
                endRow--;
            }
        }
    }
}