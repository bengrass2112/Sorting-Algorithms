class Main {
  public static void main(String[] args) {
    int[] array1 = {2,8,3,7,10,20,1,4,5,18,17,19,6,9,14,11,12,15,16,13};
    int[] array2 = {17,18,5,4,1,20,10,7,3,8,2,13,16,15,12,11,14,9,6,19};
    selectionSort(array1);
    insertionSort(array2);
    for(int i=0; i < array1.length; i++){
      System.out.println(array1[i]);
      System.out.println(array2[i]);
    }
  }
  public static void selectionSort(int[] arr){
    for(int i = 0; i < arr.length - 1; i++){
      int min = i;
      for(int j = i; j < arr.length; j++){
        if(arr[min] > arr[j]){
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
  public static void insertionSort(int[] arr){
    for(int i=1; i < arr.length; i++){
      int temp = arr[i];
      int num = i;
      while(num > 0 && temp < arr[num-1]){
        arr[num] = arr[num-1];
        num--;
      }
      arr[num] = temp;
    }
  }
}
