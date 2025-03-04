public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 35, 23, 89};
        int target = 23;
        int result = linearSearch(numbers, target);
        if (result != -1) {
            System.out.println("El elemento ha sido encontrado exitosamente: " + result);
        } else {
            System.out.println("No he podido encontrar el elemento buscado");
        }
    }

    public static int linearSearch(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) return i;
        }
        return -1;
    }
}
