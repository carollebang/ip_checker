package za.co.example;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new IpAddressChecker().pattern));
        }
    }
}

public class IpAddressChecker {
    String regExpression = "[0-2][0-5][0-5]";//
    String pattern = regExpression + "." + regExpression + "." + regExpression + "." + regExpression;
}