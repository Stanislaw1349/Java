public class MinMaxAve {
    /*Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее
    среди всех значений между 2-мя индексами.

    Test Data:
            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}*/


    public int[] minMaxAve(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start < 0 || start > end || end > (arr.length - 1)) {

            return new int[]{};
        }
        int min = arr[start];
        int max = arr[end];
        int ave = 0;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (arr[start] < arr[i]) {
                max = arr[i];
            }
            if (arr[start] > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        ave = sum / (end - start + 1);

        int[] res = {min, max, ave};

        return res;
    }
}
