import java.util.*;

class question4 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] combinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, combinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, combinedArray, nums1.length, nums2.length);
        int length = combinedArray.length;
        double median = 0;
        Arrays.sort(combinedArray);

        System.out.println(Arrays.toString(combinedArray));

        if(length % 2 == 0)
        {
            median = (combinedArray[length/2] + combinedArray[(length/2)-1]);
            median = median/2;
            return median;
        }
        else
        {
            return median = combinedArray[((int)Math.floor(length/2))];
        }
    }

    public static void main(String[] args)
    {
        question4 mySolution = new question4();
        double myNum = 0;
        myNum = mySolution.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        System.out.println(myNum);
    }   
}

