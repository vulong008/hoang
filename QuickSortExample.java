
import java.util.Arrays;

public class QuickSortExample {
    public static void main(String[] args) {
        // Đây là mảng chưa được sắp xếp.
        Integer[] array = new Integer[] {50, 31, 20, 24, 18, 12, 5, 7};
        // Gọi hàm sắp xếp mảng
        quickSort(array, 0, array.length - 1);
        // Hiển thị kết quả sau khi thực hiện sắp xếp
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(Integer[] arr, int low, int high) {
        //Kiểm tra xem mảng có null hay rỗng không
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        //Chọn phần tử ở giữa mảng làm pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];
        // Tiến hành phân chia mảng
        int i = low, j = high;
        while (i <= j) {
            //Kiểm tra cho đến khi tất cả giá trị trong mảng bên trái nhỏ hơn pivot
            while (arr[i] < pivot) {
                i++;
            }
            // Kiểm tra cho đến khi tất cả các giá trị trong mảng bên phải lớn hơn pivot            
            while (arr[j] > pivot) {
                j--;
            }
            //Tiến hành so sánh giá trị từ cả hai phía xem có cần đổi chỗ hay không
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        //Thực hiện đệ quy để sắp xếp các mảng con
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }
    public static void swap(Integer array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}