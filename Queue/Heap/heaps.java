package Queue.Heap;

public class heaps {
    static int arr[] = new int[100];
    static int size = 0;

    static void insert(int n) {
        size += 1;
        int index = size;
        arr[index] = n;
        while (index > 1) {
            int parent = index / 2;
            if (arr[parent] < arr[index]) {
                arr[parent] = arr[index] ^ arr[parent];
                arr[index] = arr[index] ^ arr[parent];
                arr[parent] = arr[index] ^ arr[parent];
                index = parent;
            } else
                return;
        }
    }

    static void delete() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        arr[1] = arr[size];
        size--;
        int i = 1;
        while (i < size) {
            int left = 2 * i;
            int right = 2 * i + 1;
            if (left < size && arr[left] > arr[i]) {
                arr[left] = arr[left] ^ arr[i];
                arr[i] = arr[left] ^ arr[i];
                arr[left] = arr[left] ^ arr[i];
                i = left;
            } else if (right < size && arr[right] > arr[i]) {
                arr[right] = arr[right] ^ arr[i];
                arr[i] = arr[right] ^ arr[i];
                arr[right] = arr[right] ^ arr[i];
                i = right;
            } else
                return;
        }
    }

    static void print() {
        for (int i = 1; i <= size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if (left < n && arr[largest] < arr[left])
            largest = left;
        if (right < n && arr[largest] < arr[right])
            largest = right;
        if (largest != i) {
            arr[largest] = arr[largest] ^ arr[i];
            arr[i] = arr[largest] ^ arr[i];
            arr[largest] = arr[largest] ^ arr[i];
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        insert(50);
        insert(55);
        insert(53);
        insert(52);
        insert(54);
        print();
        delete();
        print();
        int ar[] = { -1, 54, 53, 55, 52, 50 };
        int n = 5;
        for (int i = n / 2; i > 0; i--) {
            heapify(ar, n, i);
        }
        for (int i = 1; i <= n; i++)
            System.out.print(ar[i] + " ");
        System.out.println();
    }
}
