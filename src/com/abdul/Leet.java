package com.abdul;

public class Leet {

        public int[] searchRange(int[] nums, int target) {
            int [] ans={-1,1};
            //check for first occurence if  target first
            int start=search(nums,target,true);
            int end=search(nums,target, false);
            ans[0]=start;
            ans[1]=end;

            return ans;
        }

        //this function just returns teh index value of hthe target
        int search(int [] nums,int target,boolean findstartindex){
            int ans=-1;
            int start=0;
            int end = nums.length - 1;
            while(start<=end)
            {
                int mid = start+(end-start)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }
                else if(target>nums[mid]){
                    start = mid+1;
                }
                else{
                    //potential answer is foung
                    ans=mid;
                    if(findstartindex){
                        end=mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
            }
            return ans;

        }
    }

