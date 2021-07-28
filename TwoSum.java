//Two Sum

public class Solution 
{

public static int[] twoSum(int[] nums, int target) 
    
    
{
    int index1 = 0;
    int index2 = 0;
    int count = 0 ;
    //int[] nums = new int[]{ -3,2,3}; 
    //int target = 0 ;
    for( int a = 0 ; a <nums.length ; a ++ )
    {
        for (int b = 1 ; b < nums.length ; b++ ){
            
            if(nums[a]+nums[b] == target && a==b){
                continue; 
            }
            
            else if (nums[a]+nums[b] == target ){
                index1 = a;
                index2 = b;
                count++;
                      System.out.println("Inside if index1 : " + index1 + ", index2 " + index2 + ", Counter " + count);
                break;
            }
            else if (nums[a]+nums[nums.length-1]==target){
                index1 = a;
                index2 = nums.length-1;
                count++;
                      System.out.println("Inside else if index1 : " + index1 + ", index2 " + index2 + ", Counter " + count);
                break;
            }
            
         
        }
        
           if (count == 1)
            {
                break;
            }
    }
              
    
    
    
    return new int[]{index1 , index2};
            
}


// public static void main(String args[] )
// {
    
// int nums[] = {3,2,3};
// int target = 6 ;
// int a[] = twoSum(nums , target );

// for (int j = 0 ; j < a.length ; j++)
//  {
//     System.out.println(a[j]);
//  }

// }

}
   
