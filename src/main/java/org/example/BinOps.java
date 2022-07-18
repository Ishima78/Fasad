package org.example;

public class BinOps {

    public String sum(String a, String b) {
        int sumS = Integer.parseInt(a, 2);
        int sumD = Integer.parseInt(b, 2);
        int sum = sumD + sumS;
        return Integer.toBinaryString(sum);

    }
    
    public String mult(String a, String b) {
        int multS = Integer.parseInt(a, 2);
        int multD = Integer.parseInt(b, 2);
        int mult = multD * multS;
        return Integer.toBinaryString(mult);
    }
}

