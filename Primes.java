public class Primes {
    public static void main(String[] args) {
        final int n = Integer.parseInt(args[0]);

        if (n != 0 && n != 1){
            boolean[] arr = new boolean[n+1];
            arr[0] = false;
            arr[1] = false;

            for (int i = 2; i < arr.length; i++){
                arr[i] = true;
            }

            int indexP = 2;

            while (indexP <= (int)Math.sqrt(n)){

                if (arr[indexP]){
                    int multiple = 2;
                    while ((indexP * multiple) < arr.length){
                        if (arr[indexP * multiple] = true){
                            arr[indexP * multiple] = false;
                        }
                        multiple++;  
                    } 
                }

                indexP++;
            }     

            double countPrimes = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[j]){
                System.out.println(j);
                countPrimes++;
                }
            }
            double avg = (countPrimes / n) * 100;
            if (countPrimes == 1){
                System.out.println("There is " + (int)countPrimes + " prime between 2 and " + n + " (" + (int)avg * 2 + "% are primes)");
            } else {
                System.out.println("There are " + (int)countPrimes + " primes between 2 and " + n + " (" + (int)avg + "% are primes)");
            }
        } else {
            System.out.println("There are no primes numbers up to " + n + " (0% are primes)");
        }
    }
}