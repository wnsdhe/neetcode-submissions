class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;
        while (l <= r) {
            int curr = (l+r)/2;
            int[] currMatrix = matrix[curr];
            
            if (currMatrix[0]<=target && currMatrix[currMatrix.length-1] >= target) {
                int l2 = 0;
                int r2 = currMatrix.length-1;
                while (l2<=r2) {
                    int curr2 = (l2+r2)/2;
                    if (currMatrix[curr2] == target) {
                        return true;
                    } else if (currMatrix[curr2] > target) {
                        r2 = curr2-1;
                    } else {
                        l2 = curr2+1;
                    }
                }
                return false;
            } else if (currMatrix[0] > target) {
                r = curr-1;
            } else {
                l = curr+1;
            }
        }
        return false;
    }
}
