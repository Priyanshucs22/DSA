package Coding_Problems;

public class ZigzagConversion {
    public static void main(String[] args) {
        int numrows = 4;
        String s = "PAYPALISHIRING";
        int m=0;
        for (int i = 0; i < s.length(); i++) {
            for (int k = 0; k < numrows; k++) {
                for(int j=0;j<k;j++){
                    System.out.print(s.charAt(m++));
                }
            }
        }
    }
}
