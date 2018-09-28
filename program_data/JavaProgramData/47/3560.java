package <missing>;

public class GlobalMembers
{
	public static void Exchange(int[] A, int n)
	{
		for (int i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				A[i] = Integer.parseInt(tempVar);
			}
		}
		System.out.printf("%d",A[n - 1]);
		for (int j = n - 2;j >= 0;j--)
		{
			System.out.printf(" %d",A[j]);
		}
	}

	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] A = new int[n];
		Exchange(A, n);
		return 0;
	}



}

