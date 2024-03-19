package Arrays;

//2# Ache os números duplicados no array e sua posição
public class Array2 {
    public static void main(String[] args) {
        int[] array = {7, 11, 18, 22, 22, 27, 32,};

        for (int i = 0; i < array.length; i++){
            int index = array[i];
            for (int j = i + 1; j < array.length; j++){
                if (index == array[j]){
                    System.out.println("The duplicate number is: " + index);
                    System.out.println("In the position: " + i + " and " + j);
                }

            }
        }


    }
}
