package com.company;

import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        InetAddress addressname = InetAddress.getByName("www.google.com");
        System.out.println(addressname);
        InetAddress s[] = InetAddress.getAllByName("www.google.com");
        int i;
        for(i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}
