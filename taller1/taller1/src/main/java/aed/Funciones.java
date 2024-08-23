package aed;

class Funciones {
    int cuadrado(int x) {
        int res;
        res=x*x;
        return res;
    }

    double distancia(double x, double y) {
        double res;
        res=Math.sqrt(x*x+y*y);
        return res;
    }

    boolean esPar(int n) {
        boolean res = (n % 2 == 0);
        return res;
    }

    boolean esBisiesto(int n) {
        boolean res = (n % 400 == 0) || ((n % 4 == 0) && !(n % 100 == 0));
        return res;
    }

    int factorialIterativo(int n) {
        int res=1;
        for(int i=1;i < (n+1);i++) {
            res=res*i;
        }
        return res;
    }

    int factorialRecursivo(int n) {
        int res;
        if (n==0 || n==1) {
            res = 1;
        } else {
            res=n*factorialIterativo(n-1);
        }
        
        return res;
    }

    boolean esPrimo(int n) {
        if ((n==1) || (n==2)) {
            return true;
        }
        for (int i = 2;i < n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    int sumatoria(int[] numeros) {
        int res = 0;
        for(int i = 0; i < numeros.length;i++) {
            res = res + numeros[i];
        }
        return res;
    }

    int busqueda(int[] numeros, int buscado) {
        for (int i = 0; i<numeros.length; i++) {
            if (numeros[i]==buscado) {
                return i;
            }
        }
        return 0;
    }

    boolean tienePrimo(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                return true;
            }
        }
        return false;
    }

    boolean todosPares(int[] numeros) {
        for (int i = 0; i<numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    boolean esPrefijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }

    boolean esSufijo(String s1, String s2) {
        // COMPLETAR
        return false;
    }
}
