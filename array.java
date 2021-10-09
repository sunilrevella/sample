/* Using arrays in java */
class Program8 {
    public static void main(String [] args) {
        // Single Dimesion Arrays - Method 1
        int array1[] = new int[10];
        
        for(int i=0;i<10;i++) {
            array1[i] = i+1;
        }
        for(int i=0;i<10;i++) {
            System.out.println(array1[i]);
        }

        // Single Dimesion Arrays - Method 2
        int array2[] = {1,2,3,4,5};
        for(int i=0;i<5;i++) {
            System.out.println(array2[i]);
        }

        // Double Dimesion Arrays - Method 1
        int array3[][];
        array3 = new int[3][3];
        for(int i=0; i<3; i++) { // Number of Rows
            for(int j=0; j<3; j++) { // Number Columns
                array3[i][j] = i+j+1;
            }
        }
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }

        // Double Dimesion Arrays - Method 2
        int array4[][] = {
            {1,2,3}, // First Row - Index 0 
			{4,5,6}, // Second Row - Index 1
			{7,8,9}	// Third Row - Index 2
        };
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }       

        // Array with different columns
        int array5[][] = new int[5][];
        array5[0] = new int[1];
        array5[1] = new int[2];
        array5[2] = new int[3];
        array5[3] = new int[4];
        array5[4] = new int[5];
        array5[0][0] = 11;
        array5[1][0] = 21;
        array5[1][1] = 22;
        array5[2][0] = 31;
        array5[2][1] = 32;
        array5[2][2] = 33;
        array5[3][0] = 41;
        array5[3][1] = 42;
        array5[3][2] = 43;
        array5[3][3] = 44;
        array5[4][0] = 51;
        array5[4][1] = 52;
        array5[4][2] = 53;
        array5[4][3] = 54;
        array5[4][4] = 55;
		System.out.println("Number of Rows in the array is : " + array5.length);
        for(int i=0;i<array5.length;i++) {
			System.out.println("Number of Columns in the current row " + i + "is : " + array5[i].length);
            for(int j=0;j<array5[i].length;j++) {            
                System.out.print(array5[i][j] + " ");
            }
            System.out.println();
        }
    }
}
