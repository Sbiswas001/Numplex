public class Number_Names {
    public static boolean tech_check(int n) {
        int num, firstHalf, secondHalf, digits = 0, squareOfSum;
        num = n;
        while (num > 0) {
            digits++;
            num = num / 10;
        }
        if (digits % 2 == 0) {
            num = n;
            firstHalf = num % (int) Math.pow(10, digits / 2.0);
            secondHalf = num / (int) Math.pow(10, digits / 2.0);
            squareOfSum = (firstHalf + secondHalf) * (firstHalf + secondHalf);
            return n == squareOfSum;
        }
        return false;
    }
    public static boolean prime_check(int a) {
        int flag=0;
        if(a<2) return false;
        for(int i=2;i<a;i++) {
            if(a%i==0) {
                flag++;
                break;
            }
        }
        return flag != 1;
    }
    public static boolean palindrome_check(int n) {
        return n == Functions.reverse(n);
    }

    public static boolean disarium_check(int a) {
        int sum = 0, rem, n=a;
        int len = Functions.numberOfDigits(a);
        while(a > 0) {
            rem = a%10;
            sum = sum + (int)Math.pow(rem,len);
            a = a/10;
            len--;
        }
        return sum == n;
    }
    public static boolean niven_check(int a) {
        return a % Functions.digitSum(a) == 0;
    }
    public static boolean emirp_check(int a) {
        return Number_Names.prime_check(a) == Number_Names.prime_check(Functions.reverse(a));
    }
    public static boolean pronic_check(int a) {
        int k=0;
        for(int i=0;i<=a;i++) {
            if(i*(i+1)==a) {
                k=1;
                break;
            }
        }
        return k == 1;
    }
    public static boolean automorphic_check(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10)
                return false;
            num = num/10;
            square = square/10;
        }
        return true;
    }
    public static boolean kaprekar_check(int num) {
        int n=num*num;
        int f,l,sum;
        int count=Functions.numberOfDigits(n);
        if(count%2==0) {
            f=n/(int)Math.pow(10,count/2.0);
            l=n%(int)Math.pow(10,count/2.0);
        }
        else {
            f=n/(int)Math.pow(10,(count/2.0)+1);
            l=n%((int)Math.pow(10,(count/2.0)+1));
        }
        sum=f+l;
        return sum == num;
    }
    public static boolean special_check(int n) {
        int sum=0, r, num=n;
        while(n>0) {
            r=n%10;
            sum+=Functions.factorial(r);
            n=n/10;
        }
        return sum == num;
    }
    public static boolean lucas_check(int n) {
        if(n<0) return false;
        return Functions.isPerfectSquare(5 * n * n + 20) || Functions.isPerfectSquare(5 * n * n - 20);
    }
    public static boolean smith_check(int a) {
        if(Number_Names.prime_check(a) || a<4)
            return false;
        int[] factors = Functions.primeFactors(a);
        int sum=0;
        for (int factor : factors) {
            sum += Functions.digitSum(factor);
        }
        return Functions.digitSum(a) == sum;
    }
    public static boolean armstrong_check(int n) {
        int i=Functions.numberOfDigits(n),b=n,s=0;
        while(b>0) {
            s=s+(int)Math.pow(b%10,i);
            b/=10;
        }
        return s == n;
    }
    public static boolean fibonacci_check(int n) {
        if(n<0) return false;
        return Functions.isPerfectSquare(5 * n * n + 4) || Functions.isPerfectSquare(5 * n * n - 4);
    }
    public static boolean circular_prime_check(int a) {
        int count=Functions.numberOfDigits(a);
        int num=a, k=a;
        for(int i=1;i<=count;i++) {
            int x=k%10;
            if(x==0 || x==2 || x==4 || x==6 || x==8 || x==5)
                return false;
            k/=10;
        }
        while(Number_Names.prime_check(a)) {
            int rem = num % 10;
            int div = num / 10;
            num = (int)((Math.pow(10, count - 1)) * rem) + div;
            if (num == a)
                return true;
        }
        return false;
    }
    public static boolean prime_palindrome_check(int n) {
        return Number_Names.prime_check(n) && Number_Names.palindrome_check(n);
    }
    public static boolean isbn_check(long n) {
        long[] x =Functions.digit_array(n);
        long sum=0;
        for(int i=0;i<x.length;i++) {
            sum+=(i+1)*x[i];
        }
        return sum % 11 == 0;
    }
    public static boolean abundant_check(int n) {
        return n < Functions.arraySum(Functions.factors(n)) - n;
    }
    public static boolean fermat_check(int n) {
        double x=Math.log(Math.log((double)n-1)/Math.log(2))/Math.log(2);
        return x == (int) x;
    }
    public static boolean ugly_check(int n) {
        int[] x =Functions.primeFactors(n);
        for (int j : x) {
            if (j != 2 && j != 3 && j != 5)
                return false;
        }
        return true;
    }
    public static boolean neon_check(int n) {
        return n == Functions.digitSum(n * n);
    }
    public static boolean spy_check(int num) {
        return Functions.digitSum(num) == Functions.digitProduct(num);
    }
    public static boolean happy_check(int n) {
        long num=n, sum;
        do {
            long r;
            sum=0;
            while(num>0) {
                r=num%10;
                sum+=r*r;
                num=num/10;
            }
            num=sum;
        }while(sum>=10);
        return sum == 1;
    }
    public static boolean duck_check(String num) {
        int n=num.length();
        for(int i=0;i<n;i++) {
            if(num.charAt(i) == '0')
                return false;
        }
        return true;
    }
}