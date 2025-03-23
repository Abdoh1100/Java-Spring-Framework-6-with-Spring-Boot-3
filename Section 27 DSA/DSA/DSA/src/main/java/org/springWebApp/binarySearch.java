package org.springWebApp;

public class binarySearch {


    public static int BS(int [] nums,int target,int left,int right){




     if(left>right){
         //not found
         return -1;
     }

     int mid =left+(right-left)/2;//Works exactly like (left + right) / 2 mathematically, but safer.

     if(nums[mid]==target)
         return mid;
     if(nums[mid]>target)
         return BS(nums,target,left,mid-1);
     if(nums[mid]<target)
         return BS(nums,target,mid+1,right);
        

       return -1;


    }

    public static void main (String args[]){

        int nums[]={1,3,4,5,7,9,12};
        int index=BS(nums,7,0,nums.length-1);
        System.out.println(index);

    }
}
