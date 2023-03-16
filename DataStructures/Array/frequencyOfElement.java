public class frequencyOfElement {
  public static void main(String[] args) {
    int arr[] = new int[] { 1, 2, 3, 4, 5, 4, 3, 3, 2, 2, 2, 2, 1, 6 };
    int fr[] = new int[arr.length];
    int visited = -1;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] == arr[i]) {
          count++;
          fr[j] = visited;
        }
      }
      if (fr[i] != visited) {
        fr[i] = count;
      }
    }
    for (int i = 0; i < fr.length; i++) {
      if (fr[i] != visited)
        System.out.println("Element " + arr[i] + " has occured " + fr[i] + " times");
    }
  }
}