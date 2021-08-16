package com.training.es.hw2;

public class FibonacciFactorial {

    public static int fib(int n) {
        if (n <= 1) return n;
        else return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int fibonacciOrFactorial = Integer.parseInt(args[0]);
        int cycleOperator = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        int firstFib = 0;
        int fact = 1;
        switch (fibonacciOrFactorial) {
            //Fibonacci
            case 1:
                switch (cycleOperator) {
                    case 1:
                        while (firstFib < n) {
                            System.out.print(fib(firstFib) + " ");
                            firstFib++;
                        }
                        break;
                    case 2:
                        do {
                            System.out.print(fib(firstFib) + " ");
                            firstFib++;
                        }
                        while (firstFib < n);
                        break;
                    case 3:
                        for (; firstFib < n; firstFib++) {
                            System.out.print(fib(firstFib) + " ");
                        }
                }
                break;
            //Factorial
            case 2:
                System.out.print(n + "! = ");
                switch (cycleOperator) {
                    case 1:
                        while (n > 0) {
                            fact *= n;
                            n--;
                        }
                        System.out.print(fact);
                        break;
                    case 2:
                        do {
                            fact *= n;
                            n--;
                        }
                        while (n > 0);
                        System.out.print(fact);
                        break;
                    case 3:
                        for (; n > 0; n--) {
                            fact *= n;
                        }
                        System.out.print(fact);
                }
        }
    }

}



