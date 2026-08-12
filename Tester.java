public class Tester{
  public static void main(String[] args){
    int[] input = {0, 1, 3, 7, 15, 31, 127, 511};
    int[] expected = {2, 3, 7, 19, 53, 131, 719, 3671};
    for(int index = 0; index < input.length; index++){
      int prime = nthPrime(input[index]);
      if(prime == expected[index]){
        System.out.println("pass");
      }
      else{
        System.out.println("fail expected " + expected[index] + " but value returned was " + prime);
      }
    }
  }

  public static boolean isPrime(int x){
    for(int index = 2; index < x-1; index++){
      if(x % index == 0){
        return false;
      }
    }
    return true;
  }

  public static int nthPrime(int n){
    int index = 2;
    int primeIndex = 0;
    int result = 2;
    while(primeIndex <= n){
      if(isPrime(index)){
        result = index;
        index++;
        primeIndex++;
      }
      else{
        index++;
      }
    }
    return result;
  }
}
