binary search应用条件是sorted，可以有duplicates
需要注意的就是找第一个target的index和最后一个target的index是不一样的，
sorted不一定是严格sorted，rotated的话咱也能做，但是必须没有duplicates
还有就是遇到array首先考虑是否为空，length==0吗，这两个是两回事，要都写出来
还有就是result[2]默认是两个元素都是0，如果题中给出找不到返-1，-1那array==null||length ==0
的结果就要好好定义啦




*1. search insert position
这题需要注意（1）A==null || A.length == 0 的情况，千万别忽略length为0的情况(2)因为array是sorted的
所以直接考虑target<第一个值，return 0(3)最后target > 最后一个值，就返回A.length
 public int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){
            return 0;
        }
        if(target < A[0]){
           return 0; 
        }
        //find the first position where the num is >= target
        int start = 0, end = A.length - 1;
        int mid;
        while (start + 1 < end){
            mid = (end - start)/2 + start;
            if(A[mid] >= target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(A[start] >= target){
            return start;
        }
        if(A[end] >= target){
            return end;
        }
        return A.length;
    }
*2. Search a 2D Matrix
就是给定target 然后这个matrix是递增的，第二行第一个数总比第一行最后一个数大。
所以先找target可能所在行，再找target所在列
public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0){
            return false;
        }
        //first find the row where target can be, which is the
        //last number that is <= target
        int start = 0, end = matrix.length - 1;
        int mid;
        int index1 = 0;
        if(target < matrix[0][0]){
            return false;
        }
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(matrix[mid][0] == target){
                return true;
            }
            if(matrix[mid][0] > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(matrix[end][0] < target){
            index1 = end;
        }
        else if(matrix[start][0] < target){
            index1 = start;
        }
        start = 0;
        end = matrix[index1].length - 1;
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(matrix[index1][mid] == target){
                return true;
            }
            if(matrix[index1][mid] > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(matrix[index1][start] == target || matrix[index1][end] == target){
            return true;
        }
        return false;
    }
*3. search a 2D matrixII
这个题跟上个不同的地方在于这个每一行都是从左到右递增，每一列也是，但是第二行的第一个不一定比第一行的
值都大
O(m+n) time and O(1) extra space
 public int searchMatrix(int[][] matrix, int target) {
        // write your code here
        //starting from left bottom to right top
        int a = matrix.length - 1;
        int b = 0;
        int count = 0;
        while(a >= 0 && b <= matrix[0].length - 1){
            if(matrix[a][b] > target){
                a--;
            }
            else if(matrix[a][b] < target){
                b++;
            }
            else if(matrix[a][b] == target){
                count++;
                a--;
                b++;
            }
        }
        return count;
    }
就是这个从左下角开始 要么删一行 要么删一列
*3. Binary Search：找target第一个出现的位置
public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums == null || target < nums[0] || target > nums[nums.length - 1]){
            return -1;
        }
        int start = 0, end = nums.length - 1;
        int mid;
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(nums[mid] >= target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(nums[start] == target){
            return start;
        }
        if(nums[end] == target){
            return end;
        }
        return -1;
    }
*4. find the min in rotated sorted array(no duplicates)
这种题要首先要注意有没有duplicates，没有二分法，有则全扫
然后看是找min还是min的index
 public int findMin(int[] num) {
        // write your code here
        if(num == null || num.length == 0){
            return -1;
        }
        if(num[0] < num[num.length - 1]){
            return num[0];
        }
        int start = 0, end = num.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(num[mid] < num[mid + 1] && num[mid] < num[mid - 1]){
                return num[mid];
            }    
            if(num[mid] > num[start]){
                start = mid;
            }
            else{
                end = mid;
            }
        }
        return Math.min(num[start], num[end]);
    }
 有duplicates就得全扫
  public int findMin(int[] num) {
        // write your code here
        //if there is duplicate, then we can only scan to find min
        //cant use binary search
        if(num == null || num.length == 0){
            return -1;
        }
        int min = num[0];
        for(int i : num){
            min = i < min ? i : min;
        }
        return min;
    }
*5. search in rotated sorted array
前提是没有duplicates！！！！！这点真的很重要！！！！
画个图，讨论一下到底A[mid]是在A[start]之上or之下
需要注意的是只要给了array就先讨论A == null || A.length == 0的情况，这是两种不同的情况，不能省
 public int search(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){
            return -1;
        }
        int start = 0, end = A.length - 1;
        int mid;
        while(start + 1 < end){
            mid = (end - start)/2 + start;
            //discuss whether the mid is above A[start] or below
            if(A[mid] > A[start]){
                if(A[start] <= target && target <= A[mid]){
                    end = mid;
                }
                else{
                    start = mid;
                }
            }
            else{
                if(target <= A[end] && target >= A[mid]){
                    start = mid;
                }
                else{
                    end = mid;
                }
            }
        }
        if(A[start] == target){
            return start;
        }
        if(A[end] == target){
           return end; 
        }
        return -1;
    }
要是有duplicates的话，那就全扫
 public boolean search(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){
            return false;
        }
        for(int i : A){
            if(i == target){
                return true;
            }
        }
        return false;
    }
*6. find peak element
There is an integer array which has the following features:

-The numbers in adjacent positions are different.
-A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
这题的解法就是画图


  /        \
 `/          ` \
/              \
 public int findPeak(int[] A) {
        // write your code here
        if(A == null || A.length == 0){
            return -1;
        }
        int start = 0, end = A.length - 1;
        int mid;
        while(start + 1 < end){
            mid = start + (end - start)/2;
            if(A[mid] > A[mid + 1] && A[mid] > A[mid - 1]){
                return mid;
            }
            else if(A[mid] < A[mid + 1] && A[mid] > A[mid - 1]){
                start = mid;
            }
            //if(A[mid] > A[mid + 1] && A[mid] < A[mid - 1]) || A[mid]is bottom
            else{
                end = mid;
            }
        }
        if(A[start] > A[start + 1] && A[start] > A[start - 1]){
            return start;
        }
        if(A[end] > A[end + 1] && A[end] > A[end - 1]){
            return end;
        }
        return 0;
    }
*7. find first bad version
就是从某个version开始后面都是bad了，那我们就是要找到第一个bad version，注意
可以用函数VersionControl.isBadVersion(n)
    // write your code here
        //find the first badVersion
        int start = 1, end = n;
        int mid;
        while(start + 1 < end){
            mid = (end - start)/2 + start;
            if(VersionControl.isBadVersion(mid)){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(VersionControl.isBadVersion(start)){
            return start;
        }
        if(VersionControl.isBadVersion(end)){
            return end;
        }
        return 0;
    }
*8. search for a range
这里要求找到给定target的起始index和终止index,如果找不到的话就返回-1，-1
所以要注意在讨论A == null || A.length == 0的情况，不能像以前那样直接返回空的result，因为那样
的话，返回的是{0，0}而不是{-1，-1}
 public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if(A == null || A.length == 0){
            return result;
        }
        int start = 0, end = A.length - 1;
        int mid;
        //first find the starting index of the target
        while(start + 1 < end){
            mid = (end - start)/2 + start;
            if(A[mid] >= target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(A[start] == target){
            result[0] = start;
        }
        else if(A[end] == target){
            result[0] = end;
        }
        //then find the ending index of the target
        start = 0;
        end = A.length - 1;
        while(start + 1 < end){
            mid = (end - start)/2 + start;
            if(A[mid] > target){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        if(A[end] == target){
            result[1] = end;
        }
        else if(A[start] == target){
            result[1] = start;
        }
        return result;
    }
*9. wood count(#*#再看一遍)
就是给你一个数组 里面存着数的长度，然你cut成给的的n块，然后我们想做的就是二分法决定cut的length
所以要写个函数count(L, length)就是以给定length能cut成几块
注意二分法count(L, length) == k也不能return，因为要找最大长度的length 然后最后判断的时候
也是count() >= k就好，不一定非得等于k
public int woodCut(int[] L, int k) {
        // write your code here
        //first find a way to calculate how many pieces we can get given length
        if(L == null || L.length == 0){
            return 0;
        }
        int maxLength = L[0];
        for(int i : L){
            maxLength = i > maxLength ? i : maxLength;
        }
        int start = 1, end = maxLength;
        int mid;
        while(start + 1 < end){
            mid  = (end - start)/2 + start;
            
            if(count(L, mid) >= k){
                start = mid;
            }
            else if(count(L, mid) < k){
                end = mid;
            }
        }
        if(count(L, start) >= k){
            return start;
        }
        if(count(L, end) >= k){
            return end;
        }
       return 0;
    }
    private int count(int[] L, int length){
        // if(L == null || L.length == 0){
        //     return 0;
        // }
        int count = 0;
        for(int i: L){
            count += i/length;
        }
        return count;
    }
yeah！！！！binary search tree在lintcode上的题就都弄完了，以后可以再加leetcode上的题~