////////////////////////////////////////////////////////////////////
// Valerio Occhinegro 2011069
// Guirong Lan 2042368
////////////////////////////////////////////////////////////////////



package it.unipd.mtss;
import java.util.Optional;

public class IntegerToRoman {

    public static Optional<String> convert(int number){ 
        // casi limiti
        if(number < 1){ 
            return Optional.empty(); // ""
        } 
        if(number > 1000){ 
            return  Optional.empty(); 
        } 
        Integer intValues[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
        String stringArray[] ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"}; 
        StringBuilder myString = new StringBuilder();
        int i = intValues.length-1;
        while (number != 0) {
            if (number >= intValues[i]) {
                myString.append(stringArray[i]);
                number -= intValues[i];
                i++;
            }
            i--;
        }
        return Optional.of(myString.toString()); 

    }
}