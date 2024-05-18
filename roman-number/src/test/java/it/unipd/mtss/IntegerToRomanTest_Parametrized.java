package it.unipd.mtss;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collection;


import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class IntegerToRomanTest_Parametrized 
{
  private String input;
  private String expectedOutput;

  public IntegerToRomanTest_Parametrized(String input, String expectedOutput){
    this.input=input;
    this.expectedOutput=expectedOutput;
 }
 
@Parameters 
  public static Collection<String[]> testConditions() { 
  String expectedOutputs[][] = {  
    { "1", "I" },
    { "2", "II" },
    { "3", "III" },
    { "4", "IV" },
    { "5", "V" },
    { "6", "VI" },
    { "7", "VII" },
    { "8", "VIII" },
    { "9", "IX" }, 
    { "10", "X" },
    { "11", "XI" },
    { "12", "XII" },
    { "13", "XIII" },
    { "14", "XIV" },
    { "15", "XV" },
    { "16", "XVI" },
    { "17", "XVII" },
    { "18", "XVIII" },
    { "19", "XIX" },
    { "20", "XX" },
    { "27", "XXVII" },
    { "34", "XXXIV" },
    { "46", "XLVI" },
    { "57", "LVII" },
    { "61", "LXI" },
    { "74", "LXXIV" },
    { "85", "LXXXV" },
    { "99", "XCIX" },
    { "100", "C" }, 
    { "158", "CLVIII" },  
    { "234", "CCXXXIV" }, 
    { "394", "CCCXCIV" }, 
    { "409", "CDIX" }, 
    { "500", "D" }, 
    { "634", "DCXXXIV" },  
    { "790", "DCCXC" }, 
    { "808", "DCCCVIII" },  
    { "909", "CMIX" }, 
    { "1000", "M" }
    }; 
  return Arrays.asList(expectedOutputs); 
 } 
 
  @Test 
  public void TestIntToRoman_From_1_To_1000() { 
    assertEquals(expectedOutput,  
      IntegerToRoman.convert(Integer.parseInt(input)).get()); 
 }
}

    

