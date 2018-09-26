package <missing>;

public class GlobalMembers
{
	public static int[] h1 = new int[1000]; //horses belongs to tianji
	public static int[] h2 = new int[1000]; //horses belongs to qiwang

	public static void Sort(int[] h, int n) //sort the horse
	{
	   //QuickSort(h,0,n-1);
	   InsertSort(h, n);
	}


	public static void InsertSort(int[] A, int n)
	{
		int i;
		int j;
		int key;
		for (j = 1;j < n;j++)
		{
		   key = A[j];
		   //A[ j ] is added in the sorted sequence A[1, .. j-1]
		   i = j - 1;
		   while (i >= 0 && A [i] > key)
		   {
			 A[i + 1] = A[i];
			 i = i - 1;
		   }
		   A[i + 1] = key;
		}
	}


	public static void QuickSort(int[] array, int left, int right)
	{
	   int pivot;
	   int leftIdx = left;
	   int rightIdx = right;
	   int temp;
	   if (right - left > 0)
	   {
		  pivot = (left + right) / 2;
	   }
	   while (leftIdx <= pivot != 0 && rightIdx >= pivot)
	   {
				 while (array[leftIdx] < array[pivot] && leftIdx <= pivot)
				 {
					 leftIdx = leftIdx + 1;
				 }
				 while (array[rightIdx] > array[pivot] && rightIdx >= pivot)
				 {
					 rightIdx = rightIdx - 1;
				 }
				 temp = array[leftIdx];
				 array[leftIdx] = array[rightIdx];
				 array[rightIdx] = temp;
				 leftIdx = leftIdx + 1;
				 rightIdx = rightIdx - 1;
				 if (leftIdx - 1 == pivot)
				 {
					 pivot = rightIdx + 1;
					 rightIdx = rightIdx + 1;
				 }
				 else if (rightIdx + 1 == pivot)
				 {
					 pivot = leftIdx - 1;
					 leftIdx = leftIdx - 1;
				 }
	   }
			 QuickSort(array, left, pivot - 1);
			 QuickSort(array, pivot + 1, right);
	}

	// return the money tianji can win
	public static int Race(int n)
	{
		int i;
		int Nwin = 0;
		int begin1; //identify the horse
		int end1;
		int begin2;
		int end2;
			begin1 = n - 1;
			begin2 = n - 1;
		end1 = 0;
		end2 = 0;
			Sort(h1, n);
			Sort(h2, n);
		for (i = 0;i < n;i++) //n times
		{
			   if (h1[begin1] > h2[begin2]) //tianji's horse better than qiwang's
			   {
			   //tianji win 1 race
				   Nwin++;
			   begin2--;
					   begin1--;
			   }
		   else if (h1[end1] > h2[end2]) //tianji's horse better than qiwang's
		   {
					   Nwin++;
					   end1++;
			   end2++;
		   }
			   else
			   {
				  if (h1[end1] < h2[begin2]) //tianji lose 1 race
				  {
					Nwin--;
				  }
				  begin2--;
				  end1++;
			   }
		}
		return Nwin * 200;
	}

	public static void ParseHorse(int n)
	{
		int i;
		for (i = n - 1;i >= 0;i--)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				(h1[i]) = Integer.parseInt(tempVar);
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(h2[i]) = Integer.parseInt(tempVar2);
			}
		}
	}
	public static int Main()
	{
		int i;
		int n = 0;
		int[] result = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		while (i != 0)
		{
			ParseHorse(i);
			result[n] = Race(i);
			n++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",result[i]);
			if (i != n - 1)
			{
			  System.out.print("\n");
			}
		}

		return 0;
	}
}

