package <missing>;

public class GlobalMembers
{
	public static void selectionSort(int[] A, int n)
	{
		int i;
		int j;
		int k;
		int t;
		for (i = 0;i < n;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (A[j] > A[k])
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = A[k];
				A[k] = A[i];
				A[i] = t;
			}
		}
	}

	 public static int Main()
	 {
		  int i;
		  int[] A = new int[100];
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  A[i] = Integer.parseInt(tempVar2);
			  }
		  }
		  selectionSort(A, n);
		  for (i = 0;i < 2;i++)
		  {
			  System.out.printf("%d\n",A[i]);
		  }
		  return 0;
	 }


}

