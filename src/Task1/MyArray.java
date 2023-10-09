package Task1;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}
//  1_1 a)
	// To find the index of the target in the array. If the target
	// is not found in the array, then the method returns -1.
	// Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 45
	// Output: 3

//       
//        for(int i = 0; i < arr.length; i++) 
//        { 
//        , 10, 9, 45, 2, 10, 10, 45};  
//        int target = 45; 
    //	public static int search(int arr[], int target){
//    {     if(arr[i] == target) 
//                return i; 
//        } 
//        return -1; 
//    } 
//	}
//    public static void main(String args[]) 
//    { 
//        int arr[] = {12
//        int result = search(arr, target); 
//        if(result == -1) 
//            System.out.print(" //"); 
//        else
//            System.out.print("" + result); 
//    } 
//}
	// b)
//To find the index of the target in the array. If the target
//is not found in the array, then the method returns -1.
//Input: int[] array = {12, 10, 9, 45, 2, 10, 10, 45}, 15
//Output: -1

//		public static int search(int arr[], int target){
//	    { 
//	        for(int i = 0; i < arr.length; i++) 
//	        { 
//	            if(arr[i] == target) 
//	                return i; 
//	        } 
//	        return -1; 
//	    } 
//		}
//	    public static void main(String args[]) 
//	    { 
//	        int arr[] = {12, 10, 9, 45, 2, 10, 10, 45};  
//	        int target = 2; 
//	     
//	        int result = search(arr, target); 
//	       
//	            System.out.print("" + result); 
//	    } 
//	}
	// c)
	// To find the index of the target in the sorted array. If the
	//target is not found in the array, then the method returns -1.
//	public static int  iterativeBinarySearch(int target , int[]arr) {
//		int low = 0;
//        int high = arr.length - 1;
//         
//        while (low <= high) {
//            int mid = (low + high) / 2;
//             
//            if (arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                low = mid + 1;
//            } else {
//                high = mid - 1;
//            }
//        }
//         
//        return -1; // không tìm thấy giá trị cần tìm trong mảng
//    }
// 
//    public static void main(String[] args) {
//        int[] arr = { 1, 3, 4, 6, 8, 9, 11, 12, 15, 17 };
//        int target = 9;
//        int index = iterativeBinarySearch(target, arr);
//         
//         
//        if (index == -1) {
//            System.out.println("Không tìm thấy " + target + " trong mảng.");
//        } else {
//            System.out.println(target + " được tìm thấy tại chỉ số " + index + " trong mảng.");
//        }
//    }
//}

//   d)
	// To find the index of the target in the sorted array. If the
	//target is not
	// found in the array, then the method returns -1.
	

	public static int recursivebinarySearch(int[] arr, int target, int low, int high) {
		if (low > high) {
			return -1; // không tìm thấy giá trị cần tìm trong mảng
		}

		int mid = (low + high) / 2;

		if (arr[mid] == target) {
			return mid;
		} else if (arr[mid] < target) {
			return recursivebinarySearch(arr, target, mid + 1, high);
		} else {
			return recursivebinarySearch(arr, target, low, mid - 1);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 6, 8, 9, 11, 12, 15, 17 };
		int target = 9;
		int index = recursivebinarySearch(arr, target, 0, arr.length - 1);

		if (index == -1) {
			System.out.println("Không tìm thấy " + target + " trong mảng.");
		} else {
			System.out.println(target + " được tìm thấy tại chỉ số " + index + " trong mảng.");
		}
	}
}
