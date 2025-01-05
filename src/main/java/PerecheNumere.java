
import java.util.*;
import java.io.*;
import com.google.gson.*;

public class PerecheNumere {
    private int numar1;
    private int numar2;

    // Constructor fără parametri
    public PerecheNumere() {
        this.numar1 = 0;
        this.numar2 = 0;
    }

    // Constructor cu parametri
    public PerecheNumere(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    // Gettere și settere
    public int getNumar1() {
        return numar1;
    }

    public void setNumar1(int numar1) {
        this.numar1 = numar1;
    }

    public int getNumar2() {
        return numar2;
    }

    public void setNumar2(int numar2) {
        this.numar2 = numar2;
    }

    // Suprascrierea metodei toString
    @Override
    public String toString() {
        return "PerecheNumere{" + "numar1=" + numar1 + ", numar2=" + numar2 + '}';
    }

    // Metodă: Verifică dacă sunt consecutive în șirul Fibonacci
    public boolean suntConsecutiveFibonacci() {
        return esteFibonacci(numar1) && esteFibonacci(numar2) &&
                (Math.abs(fibonacciIndex(numar1) - fibonacciIndex(numar2)) == 1);
    }

    private boolean esteFibonacci(int numar) {
        int x1 = 5 * numar * numar + 4;
        int x2 = 5 * numar * numar - 4;
        return estePatratPerfect(x1) || estePatratPerfect(x2);
    }

    private boolean estePatratPerfect(int numar) {
        int sqrt = (int) Math.sqrt(numar);
        return sqrt * sqrt == numar;
    }

    private int fibonacciIndex(int numar) {
        int a = 0, b = 1, index = 0;
        while (b < numar) {
            int temp = b;
            b += a;
            a = temp;
            index++;
        }
        return b == numar ? index : -1;
    }

    // Metodă: Cel mai mic multiplu comun
    public int celMaiMicMultipluComun() {
        return (numar1 * numar2) / cmmdc(numar1, numar2);
    }

    private int cmmdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Metodă: Suma cifrelor egală
    public boolean auSumaCifrelorEgala() {
        return sumaCifrelor(numar1) == sumaCifrelor(numar2);
    }

    private int sumaCifrelor(int numar) {
        int suma = 0;
        while (numar > 0) {
            suma += numar % 10;
            numar /= 10;
        }
        return suma;
    }

    // Metodă: Același număr de cifre pare
    public boolean auAcelasiNumarDeCifrePare() {
        return numarCifrePare(numar1) == numarCifrePare(numar2);
    }

    private int numarCifrePare(int numar) {
        int count = 0;
        while (numar > 0) {
            if ((numar % 10) % 2 == 0) {
                count++;
            }
            numar /= 10;
        }
        return count;
    }
}
