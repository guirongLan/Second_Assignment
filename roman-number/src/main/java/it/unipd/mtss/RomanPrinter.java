////////////////////////////////////////////////////////////////////
// Valerio Occhinegro 2011069
// Guirong Lan 2042368
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num){

        return printAsciiArt(IntegerToRoman.convert(num).get());

    }

    private static String printAsciiArt(String romanNumber){
        String array[]={"","","","","",""};
        for(int i =0; i<romanNumber.length();i++){
            switch (romanNumber.charAt(i)) {
                case 'I':
                    array[0] = array[0] + "  _____ ";
                    array[1] = array[1] + " |_   _|";
                    array[2] = array[2] + "   | |  ";
                    array[3] = array[3] + "   | |  ";
                    array[4] = array[4] + "  _| |_ ";
                    array[5] = array[5] + " |_____|";
                    break;
                case 'V':
                    array[0] = array[0] + " __      __";
                    array[1] = array[1] + " \\ \\    / /";
                    array[2] = array[2] + "  \\ \\  / / ";
                    array[3] = array[3] + "   \\ \\/ /  ";
                    array[4] = array[4] + "    \\  /   ";
                    array[5] = array[5] + "     \\/    ";
                    break;
                case 'X':
                    array[0] = array[0] + " __   __";
                    array[1] = array[1] + " \\ \\ / /";
                    array[2] = array[2] + "  \\ V / ";
                    array[3] = array[3] + "   > <  ";
                    array[4] = array[4] + "  / . \\ ";
                    array[5] = array[5] + " /_/ \\_\\";
                    break;
                case 'L':
                    array[0] = array[0] + "  _      ";
                    array[1] = array[1] + " | |     ";
                    array[2] = array[2] + " | |     ";
                    array[3] = array[3] + " | |     ";
                    array[4] = array[4] + " | |____ ";
                    array[5] = array[5] + " |______|";
                    break;
                case 'C':
                    array[0] = array[0] + "   _____ ";
                    array[1] = array[1] + "  / ____|";
                    array[2] = array[2] + " | |     ";
                    array[3] = array[3] + " | |     ";
                    array[4] = array[4] + " | |____ ";
                    array[5] = array[5] + "  \\_____|";
                    break;
                case 'D':
                    array[0] = array[0] + "  _____  ";
                    array[1] = array[1] + " |  __ \\ ";
                    array[2] = array[2] + " | |  | |";
                    array[3] = array[3] + " | |  | |";
                    array[4] = array[4] + " | |__| |";
                    array[5] = array[5] + " |_____/ ";
                    break;
                case 'M':
                    array[0] = array[0] + "  __  __ ";
                    array[1] = array[1] + " |  \\/  |";
                    array[2] = array[2] + " | \\  / |";
                    array[3] = array[3] + " | |\\/| |";
                    array[4] = array[4] + " | |  | |";
                    array[5] = array[5] + " |_|  |_|";
                    break;
                default:
                    break;
            }
        }
        String myString = new String();
        for(int i = 0; i < array.length;i++){
            myString = myString + array[i] + "\n";
        }
        return myString;
    }
}