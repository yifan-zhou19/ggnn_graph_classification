package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[25];
		int[] A = new int[25];
		int n;
		int i;
		int j;
		int max;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		A[n - 1] = 1;
		for (i = n - 2;i >= 0;i--)
		{
			for (j = i;j < n;j++)
			{
				if (a[i] >= a[j])
				{
					if (A[i] <= A[j])
					{
						A[i] = A[j] + 1;
					}
				}
			}
				if (A[i] == 0)
				{
					A[i] = 1;
				}
		}
		max = A[0];
		for (i = 0;i < n;i++)
		{
			if (A[i] > max)
			{
				max = A[i];
			}
		}
		System.out.printf("%d",max);
	}

}

