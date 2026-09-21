class Solution {
    public boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isSumOfTwo(int n) {
        // code here
        for(int i = 2; i < n; i++){
            int second = n - i;
            if(isPrime(i) && isPrime(second)){
                return true;
            }
        }
        return false;
    }
}