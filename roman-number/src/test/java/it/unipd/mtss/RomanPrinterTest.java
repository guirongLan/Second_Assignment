package it.unipd.mtss;

import static org.junit.Assert.*;
import org.junit.Test;


public class RomanPrinterTest {

    @Test
    public void test1() {
        System.out.println("\\");
            String exp =    "  _____ \n" + 
                            " |_   _|\n" +
                            "   | |  \n" +
                            "   | |  \n" +
                            "  _| |_ \n" +
                            " |_____|\n";
            String act = RomanPrinter.print(1);
            assertEquals(exp, act);
    }
    @Test 
    public void test4() {        
        String exp =    "  _____  __      __\n" +
                        " |_   _| \\ \\    / /\n" +
                        "   | |    \\ \\  / / \n" +
                        "   | |     \\ \\/ /  \n" +
                        "  _| |_     \\  /   \n" +
                        " |_____|     \\/    \n" ;
        String act = RomanPrinter.print(4);
        assertEquals(exp, act);
    }
    @Test 
    public void test5() {        
        String exp =    " __      __\n" + 
                        " \\ \\    / /\n" +
                        "  \\ \\  / / \n" + 
                        "   \\ \\/ /  \n" +
                        "    \\  /   \n" +
                        "     \\/    \n";
        String act = RomanPrinter.print(5);
        assertEquals(exp, act);
    }
    @Test 
    public void test9() {
        String exp =    "  _____  __   __\n" +
                        " |_   _| \\ \\ / /\n" +
                        "   | |    \\ V / \n" +
                        "   | |     > <  \n" +
                        "  _| |_   / . \\ \n" +
                        " |_____| /_/ \\_\\\n" ;
        String act = RomanPrinter.print(9);
        assertEquals(exp, act);
    }
    @Test
    public void test10() {
        String exp =    " __   __\n" + 
                        " \\ \\ / /\n" +
                        "  \\ V / \n" + 
                        "   > <  \n" + 
                        "  / . \\ \n" + 
                        " /_/ \\_\\\n";
        String act = RomanPrinter.print(10);
        assertEquals(exp, act);
    }
    @Test 
    public void test40() {
        String exp =    " __   __  _      \n"+
                        " \\ \\ / / | |     \n"+
                        "  \\ V /  | |     \n"+
                        "   > <   | |     \n"+
                        "  / . \\  | |____ \n"+
                        " /_/ \\_\\ |______|\n";
        String act = RomanPrinter.print(40);
        assertEquals(exp, act);
    }
    @Test 
    public void test50() {
        String exp =    "  _      \n" + 
                        " | |     \n" + 
                        " | |     \n" + 
                        " | |     \n" +
                        " | |____ \n" + 
                        " |______|\n";
        String act = RomanPrinter.print(50);
        assertEquals(exp, act);
    }
    @Test 
    public void test90() {
        String exp =    " __   __   _____ \n" +
                        " \\ \\ / /  / ____|\n" +
                        "  \\ V /  | |     \n" +
                        "   > <   | |     \n" +
                        "  / . \\  | |____ \n" +
                        " /_/ \\_\\  \\_____|\n";
        String act = RomanPrinter.print(90);
        assertEquals(exp, act);
    }
    @Test 
    public void test100() {
        String exp =    "   _____ \n" + 
                        "  / ____|\n" + 
                        " | |     \n" + 
                        " | |     \n" + 
                        " | |____ \n" + 
                        "  \\_____|\n";
        String act = RomanPrinter.print(100);
        assertEquals(exp, act);
    }
    @Test 
    public void test400() {
        String exp =    "   _____   _____  \n" +
                        "  / ____| |  __ \\ \n" +
                        " | |      | |  | |\n" +
                        " | |      | |  | |\n" +
                        " | |____  | |__| |\n" +
                        "  \\_____| |_____/ \n";
                                        
                                        
        String act = RomanPrinter.print(400);
        assertEquals(exp, act);
    } 
    @Test
    public void test500() {
        String exp =    "  _____  \n" + 
                        " |  __ \\ \n" + 
                        " | |  | |\n" + 
                        " | |  | |\n" + 
                        " | |__| |\n" + 
                        " |_____/ \n";
        String act = RomanPrinter.print(500);
        assertEquals(exp, act);
    } 
    @Test
    public void test900() {
        String exp =    "   _____   __  __ \n" +
                        "  / ____| |  \\/  |\n" +
                        " | |      | \\  / |\n" +
                        " | |      | |\\/| |\n" +
                        " | |____  | |  | |\n" +
                        "  \\_____| |_|  |_|\n" ;
        String act = RomanPrinter.print(900);
        assertEquals(exp, act);
    } 
    @Test
    public void test1000() {
        String exp =    "  __  __ \n" + 
                        " |  \\/  |\n" + 
                        " | \\  / |\n" + 
                        " | |\\/| |\n" + 
                        " | |  | |\n" + 
                        " |_|  |_|\n";
        String act = RomanPrinter.print(1000);
        assertEquals(exp, act);
    } 
    
}
