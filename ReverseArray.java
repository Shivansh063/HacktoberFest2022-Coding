/* **********************************
Requirement :- 
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}
Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
************************************ */

class ArrayQuestion1 {

    public int[] reverseArray(int[] parameterArray) {
        int[] newArray = new int[3];
        int j = 0;
        for (int i = parameterArray.length - 1; i >= 0; i--) {
            newArray[j] = parameterArray[i];
            j++;
        }
        return newArray;
    }
}

class RequiredClass {
    public static void main(String[] args) {
        int requiredArray[] = { 1, 2, 3 };
        ArrayQuestion1 newObject = new ArrayQuestion1();
        for (int values : newObject.reverseArray(requiredArray)) {
            System.out.print(values + " ");
        }
    }
}