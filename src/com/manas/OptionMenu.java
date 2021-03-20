package com.manas;
import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap<Integer,Integer> data = new HashMap<>();

    //validate login information customer number and pin number
    public void getLogin() throws IOException{
        int x=1;
        do {
            try {
                data.put(9438600,454);
                data.put(8018315,266);
                data.put(8249919,905);
                System.out.println("Welcome To The ATM project ");
                System.out.println("Enter your customer number:");
                setCustomerNumber(menuInput.nextInt());

            }catch (Exception e){

            }
        }while (x==1);
    }
}
