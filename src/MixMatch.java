//String, char, short, int, long, float, double, and boolean.
public class MixMatch {
    public static void main(String[] args){

        String name ="Belen";
        char letter ='b';
        short sInt= 5;
        int num=7;
        long longNum = 7;
        float fNum=6;
        double douNum=54.6;
        boolean test=true;

        System.out.println(name + "<--String of chars");
        System.out.println(letter + "<--char that holds single characters not entire words");
        System.out.println(sInt + "<--Short Integer which has smaller ranger and uses 2 bytes");
        System.out.println(num + "<--Integer which holds whole numbers only");
        System.out.println(longNum + "<--Long Number holds large numbers and uses 4 bytes"); 
        System.out.println(fNum + "<--float is a double up to 7 decimals and uses 4 bytes");
        System.out.println(douNum + "<--double which holds up to 14-15 decimals and uses 8 bytes");
        System.out.println(test + "<--Boolean which holds a true or false value only");

    }
}