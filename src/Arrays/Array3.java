package Arrays;

//#3 Ache o maior e menor número de um array. 
public class Array3 {
    public static void main(String[] args) {
        int[] array = {23, 94, 33, 42, 50, 19};

        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++){
            if (array[i] > largest){
                largest = array[i];
            }
            if (array[i] < smallest){
                smallest = array[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
