package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass
{
    public static void main(String[] args) throws IOException
    {
        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please input char,when 'q' exit");
        //读取字符
        do
        {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
