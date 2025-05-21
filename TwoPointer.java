public class TwoPointer {
    public static void main(String[] args) {
      int[] myNum = {2,7,11,15};
      int target = 9;
      int left = 0;
      int right = myNum.length - 1;
      while (left < right) {
        int sum = myNum[left] + myNum[right];
        if (sum == target) {
          System.out.println("Indices: " + left + ", " + right);
          break;
        } else if (sum < target) {
          left++;
        } else {
          right--;
        }
      }
    }
  }