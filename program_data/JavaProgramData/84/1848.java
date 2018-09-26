package <missing>;

public class GlobalMembers
{
	public static void bubblesort(int[] A, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
		   for (j = n;j > i;j--)
		   {
			  if (A[j] < A[j - 1])
			  {
				  t = A[j];
				  A[j] = A[j - 1];
				  A[j - 1] = t;
			  }
		   }
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] A = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead("\n");
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		bubblesort(A, n);
		System.out.printf("%d\n%d\n", A[n],A[n - 1]);
		 return 0;
	}
}

