/* **********************************
    
Maximum and minimum of an array using minimum number of comparisons
We can use both logic according to return type mentioned in Question but 2nd approach is much better 
because  we are getting desired output in single loop.
************************************** */

class ArrayQuestion2 {

    public static int maxNumberFunction(int[] parameterArray) {
        int firstNumber = parameterArray[0];
        for (int values : parameterArray) {
            if (firstNumber > values) {
                firstNumber = values;
            }
        }
        return firstNumber;
    }

    public int minNumberFunction(int[] parameterArray) {
        int firstNumber = parameterArray[0];
        for (int values : parameterArray) {
            if (firstNumber < values) {
                firstNumber = values;
            }
        }
        return firstNumber;
    }

    public int[] minmaxNumberFunction(int[] parameterArray) {
        int finalArray[] = new int[2];
        int firstNumber = parameterArray[0];
        int secondNumber = parameterArray[0];
        for (int values : parameterArray) {
            if (firstNumber > values) {
                firstNumber = values;
            }
            if (secondNumber < values) {
                secondNumber = values;
            }
        }
        finalArray[0] = firstNumber;
        finalArray[1] = secondNumber;
        return finalArray;
    }
}

class RequiredClassForQuestion2 {
    public static void main(String[] args) {
        int[] requiredArray = { 1, 3, 45, 3000 };
        ArrayQuestion2 newObject = new ArrayQuestion2();
        int maxNumber = ArrayQuestion2.maxNumberFunction(requiredArray);
        int minNumber = newObject.minNumberFunction(requiredArray);
        int minmaxValues[] = newObject.minmaxNumberFunction(requiredArray);
        System.out.println(maxNumber + " " + minNumber);
        System.out.println("Output of 2nd Approach :- " + minmaxValues[0] + "    " + minmaxValues[1]);
    }
}