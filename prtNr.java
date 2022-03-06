
package javatutorial;

import java.util.HashMap;
import java.util.Map;


public class prtNr {  
       
    public String ptrNr(String number){
        Map<String, String> keyNrPhone = new HashMap<String, String>();
        keyNrPhone.put("A","2");
        keyNrPhone.put("B","22");
        keyNrPhone.put("C","222");
        keyNrPhone.put("D","3");
        keyNrPhone.put("E","33");
        keyNrPhone.put("F","333");
        keyNrPhone.put("G","4");
        keyNrPhone.put("H","44");
        keyNrPhone.put("I","444");
        keyNrPhone.put("J","5");
        keyNrPhone.put("K","55");
        keyNrPhone.put("L","555");
        keyNrPhone.put("M","6");
        keyNrPhone.put("N","66");
        keyNrPhone.put("O","666");
        keyNrPhone.put("P","7");
        keyNrPhone.put("Q","77");
        keyNrPhone.put("R","777");
        keyNrPhone.put("S","7777");
        keyNrPhone.put("T","8");
        keyNrPhone.put("U","88");
        keyNrPhone.put("V","888");
        keyNrPhone.put("W","9");
        keyNrPhone.put("X","99");
        keyNrPhone.put("Y","999");
        keyNrPhone.put("Z","9999");
                
        char[] arr = new char[number.length()];
        int count = number.length();
        String wynik = "";
        for(int i = 0; i < count ; i++){
            arr[i] = number.charAt(i);
            wynik += keyNrPhone.get(String.valueOf(arr[i]));
        }  
        //System.out.println(wynik);
        return wynik;
    }
    
}
