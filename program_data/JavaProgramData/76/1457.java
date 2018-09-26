package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int k;
		int n;
		int t;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		int[] A = new int[n];
		int[] B = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
				A[i] = a[i];
				B[i] = b[i];
		}
		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (A[i] > A[i + 1])
				{
				   t = A[i];
				   A[i] = A[i + 1];
				   A[i + 1] = t;
				}
			}
		}
		for (k = n - 1;k > 0;k--)
		{
			for (i = 0;i < k;i++)
			{
				if (B[i] > B[i + 1])
				{
				   m = B[i];
				   B[i] = B[i + 1];
				   B[i + 1] = m;
				}
			}
		}
		for (d = A[0] + 0.5;d < B[n - 1];d++)
		{
			 for (i = 0;i < n;i++)
			 {
				 if (d > a[i] && d < b[i])
				 {
					break;
				 }
			 }
			if (i == n)
			{
	System.out.print("no");
	   break;
			}
		}
		if (d == B[n - 1] + 0.5)
		{
	   System.out.printf("%d %d",A[0],B[n - 1]);
		}
	return 0;
	}
}

