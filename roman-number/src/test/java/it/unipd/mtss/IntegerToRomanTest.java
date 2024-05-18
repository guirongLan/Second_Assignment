package it.unipd.mtss;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Optional;

public class IntegerToRomanTest {
    
@Test 
public void Test_Number_zero(){
    assertTrue(Optional.empty().equals(IntegerToRoman.convert(0))); 
}
  
@Test
public void Test_Negative_Number(){    
    assertTrue(Optional.empty().equals(IntegerToRoman.convert(-22)));
} 

@Test 
public void Test_Number_Bigger_1000(){
    assertTrue(Optional.empty().equals(IntegerToRoman.convert(1001))); 
}
}
