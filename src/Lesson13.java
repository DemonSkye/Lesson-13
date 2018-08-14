public class Lesson13 {
    public static void main(String args[]){
        //Arrays - What are they?
        //It's for when we need to hold than 1 of a specific type of variable.

        //Let a user specify 3 numbers of their choosing, and then multiply them together, from last to first?
        int [] myArray = new int [5];
        //myArray |_|_|_|_|_|
        //myArray - values   |2|5|10|15|20|
        //myArray - position |0|1|2 |3 | 4|
        myArray[0] = 2;
        myArray[1] = 5;
        myArray[2] = 10;
        myArray[3] = 15;
        myArray[4] = 20;

        int product = 1;
        for(int i = myArray.length-1; i > 0; i--){
            //Random access of array
            // [ i ] checks the "subscript" (position) i for what's in "myArray array"
            product *= myArray[ i ];
        }

        product /= myArray[0];


        System.out.println(product);

    }
}
