package com.spartaglobal.jsonjackson;

import JacksonDeserialisation.RatesDeserialiser;
import JacksonManualParsing.JacksonManualExample;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        JacksonManualExample manualExample = new JacksonManualExample("resources/rates.json");
        System.out.println(manualExample.getSuccess());

        RatesDeserialiser ratesDeserialiser =  new RatesDeserialiser("resources/rates.json");

        System.out.println(ratesDeserialiser.ratesMapped.getRates().get("GBP"));
    }
}
