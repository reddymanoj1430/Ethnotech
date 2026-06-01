package Task1;
public class JaggedArray {

    public static void main(String[] args) {

        // Declaration + Creation
        int[][] arr = new int[3][];

        // column sizes
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];
        System.out.println("        Maths|English  |SocialStu|Science|");
        // Initialization
        String Students[]= {"Man","Kis","Ram"};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
            	
                arr[i][j] = (i + 1) * (j + 1)*10;
            }
        }

        // Printing
        for(int i = 0; i < arr.length; i++) {
        	System.out.print(Students[i]+"|");
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print("    "+arr[i][j] + "   |");
            }
            System.out.println();
        }
    }
}