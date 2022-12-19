package com.sltc.soa.client;

import com.sltc.soa.client.stub.DemoWS;
import com.sltc.soa.client.stub.DemoWSService;

import java.net.URL;
import java.util.Scanner;

public class Main
{

    public static void main( String[] args )
    {
       // URL url = new URL("http://demowebservice.com:8080/currencyservice?wsdl");
       // DemoWSService demoWSService = new DemoWSService(url);

        DemoWSService demoWSService = new DemoWSService();
        DemoWS demoWSPort = demoWSService.getDemoWSPort();

        int inputA = readInputInt();
        int inputB = readInputInt();

        int result = demoWSPort.addition( inputA, inputB );
        System.out.println( "Result of " + inputA + " + " + inputB + " is " + result );
    }

    private static int readInputInt()
    {
        int inputInt = 0;
        boolean numberFound = false;
        Scanner scan = new Scanner( System.in );
        do
        {
            System.out.println( "Please input an integer" );
            String inputStr = scan.next();
            try
            {
                inputInt = Integer.parseInt( inputStr );
                numberFound = true;
            }
            catch( Exception e )
            {
                System.out.println( "Invalid input " + inputStr + ". Please input a number." );
            }

        } while( !numberFound );
        return inputInt;
    }
}
