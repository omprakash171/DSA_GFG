class Solution {
    int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int s = 0, e = n - 1, ans = n;
        while(s <= e){
            int mid = (s + e) / 2;
            if(arr[mid] >= target){
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0, e = n - 1, ans = n;
        while(s <= e){
            int mid = (s + e) / 2;
            if(arr[mid] > target){
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        int lowerBoundIndex = getLowerBound(arr, target);
        int upperBoundIndex = getUpperBound(arr, target);
        return upperBoundIndex - lowerBoundIndex;
    }
}
