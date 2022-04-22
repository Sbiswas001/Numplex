
public class Functions {
    public static int factorial(int a) {
        int p=1;
        for(int i=1;i<=a;i++)
            p*=i;
        return p;
    }

    public static int reverse(int n) {
        int sum=0, r;
        while(n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        return sum;
    }

    public static int arraySum(int[] a) {
        int sum=0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }

    public static int digitSum(int n) {
        int sum=0, r;
        while(n>0) {
            r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }

    public static int digitProduct(int n) {
        int product=1, r;
        while(n>0) {
            r=n%10;
            product*=r;
            n=n/10;
        }
        return product;
    }

    public static int numberOfDigits(int n) {
        return (int)Math.floor(Math.log10(n))+1;
    }

    public static int numberOfFactors(int n) {
        int count=1;
        if(n>=2) {
            for(int i=2;i<=n;i++) {
                if(n%i==0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] factors(int n) {
        int l=1;
        int[] num = new int[numberOfFactors(n)];
        num[0]=1;
        if(n>=2) {
            for(int i=2;i<=n;i++) {
                if(n%i==0) {
                    num[l]=i;
                    l++;
                }
            }
        }
        return num;
    }

    public static int numberOfPrimeFactors(int n) {
        int count=0;
        if(n>=2) {
            for(int i=2;i<=n;i++) {
                if(Number_Names.prime_check(i)) {
                    while(n%i==0) {
                        n=n/i;
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[] primeFactors(int n) {
        int l=0;
        int[] num = new int[numberOfPrimeFactors(n)];
        if(n>=2) {
            for(int i=2;i<=n;i++) {
                if(Number_Names.prime_check(i)) {
                    while(n%i==0) {
                        n=n/i;
                        num[l]=i;
                        l++;
                    }
                }
            }
        }
        return num;
    }

    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    public static long reverse(long n) {
        long sum=0, r;
        while(n>0) {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        return sum;
    }

    public static long numberOfDigits(long n) {
        return (long)Math.floor(Math.log10(n))+1;
    }

    public static long[] digit_array(long a) {
        long[] x = new long[(int) numberOfDigits(a)];
        long num=reverse(a);
        for(long i = 0; i< numberOfDigits(a); i++) {
            x[(int)i]=num%10;
            num/=10;
        }
        return x;
    }
}