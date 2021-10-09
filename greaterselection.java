class Program3 {
    // Program to demonstrate Selection Construct in Java

    public static void main(String [] args) {
        int x, y;
        x = 10;
        y = 10;
		/*
        if (x < y) {
            System.out.println("X is lessthan Y");
        } else {
            System.out.println("X is greaterthan Y");
        }
        */
        if (x == y) {
            System.out.println("X is equal to Y");
        } else if (x < y) {
            System.out.println("X is lessthan Y");
        } else {
            System.out.println("X is greaterthan Y");
        }
    }
}