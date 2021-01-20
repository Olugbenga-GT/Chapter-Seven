public class Array {
    private int[] arrays;

    public Array(int[] arrays) {
        this.arrays = arrays;
    }

    public int calculateArrayTotal() {
        int total = 0;
        for (int index = 0; index < arrays.length; index++) {
            total += arrays[index];
        }

        return total;
    }


    public int getArrayAverage() {
        int total = calculateArrayTotal();
        int average = total/ arrays.length;
        return average;
    }

    public int getArrayMinimum() {
        int min = Integer.MAX_VALUE;
        for(int index = 0;  index< arrays.length; index++){
            if(arrays[index] < min)
            { min = arrays[index];}
        }
        return min;
    }

    public int getArrayMaximum() {
        int max = Integer.MIN_VALUE;
        for(int index = 0;  index < arrays.length; index++){
            if(arrays[index] > max)
            { max = arrays[index];}
        }
        return max;
    }

    public int getArrayMinimumSum() {
        int total = calculateArrayTotal();
        int maximum = getArrayMaximum();
        int minSum =  total - maximum;
        return minSum;
    }

    public int getArrayMaximumSum() {
        int total = calculateArrayTotal();
        int minimum = getArrayMinimum();
        int maxSum =  total - minimum;
        return maxSum;
    }
}

