package com.sltc.soa.client;


import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;


public class CurrencyConversion {

    public static void main(String[] args) {
            CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
            CurrencyConversionWs currencyConversionWsPort = currencyConversionWsService.getCurrencyConversionWsPort();

        /*
        Input arguments (amountInSourceCurrency,sourceCurrency,targetCurrency)
         */
           double targetCurrencyAmount = currencyConversionWsPort.convert(10, "USD", "EUR");
           System.out.println("Target Currency Amount Result: " + targetCurrencyAmount);
           // get the output of amountTargetCurrency in the terminal

    }


}


