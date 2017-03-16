/**
 * Created by moh on 16/3/17.
 */

import java.util.*;

public class PrimeFactors {

    ArrayList primeFactors;
    int primeNo;
    int number;

    public PrimeFactors () {
        primeFactors = new ArrayList();
        primeNo = 2;
    }

    public ArrayList generate(int n) {
        if(n > primeNo) {
            findPrimeNos(n);
        }
        else if (n == primeNo) {
            primeFactors.add(n);
        }
        System.out.println(primeFactors);
        return primeFactors;
    }

    public void findPrimeNos(int n) {
        number = n;
        if (number % primeNo == 0) {
            if (primeFactors.size() == 0) {
                primeFactors.add(primeNo);
            }
            else {
                if ((int) primeFactors.get(primeFactors.size() - 1) != primeNo) {
                    primeFactors.add(primeNo);
                }
            }
            if (number != primeNo) {
                number /= primeNo;
                findPrimeNos(number);
            }
            else {
                return;
            }
        } else {
            if(primeNo == 2) {
                primeNo ++;
            }
            else {
                primeNo += 2;
            }
            findPrimeNos(number);
        }
    }


    public static void main (String[] args) {
        PrimeFactors pf = new PrimeFactors();
        pf.generate(12305);
    }
}
