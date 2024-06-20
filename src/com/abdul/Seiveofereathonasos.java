//public class Seiveofereathonasos {
//    public static void main(String[] args) {
//      int n=40;
//      boolean[] primes = new boolean[n+1]; //taking array  as index
//      sieve(n,primes);
//    }
//
//    static void sieve(int n,boolean[] primes) {
//        for (int i = 2; i * i <= n; i++) {
//            if (!primes[i]) {  //initially all the elements are false
//                for (int j = i * 2; j <= n; j+=i) {  //j+=i because we are taking the multiple of the  2 3
//                    primes[j] = true;
//                }
//            }
//        }
//        for (int i=2 ; i <= n; i++) {
//            if (!primes[i]) {
//                System.out.println(i +"  ");
//            }
//        }
//    }}