/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    int *arrReturn = malloc(2*sizeof(int));
    arrReturn[0]=1;
    arrReturn[1]=1;
    for(int i=0; i<numsSize; i++){
        for(int j=i+1; j<numsSize; j++){
            if(nums[i]+nums[j]==target){
                *returnSize = 2;
                arrReturn[0] = i;
                arrReturn[1] = j;
                return arrReturn;
            }
        }
    }
    *returnSize = 0;
    return NULL;
}