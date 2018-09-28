package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int n;
		int i;
		int[] A = new int[299];
		int k;
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
		for (i = 0;i < n - 1;i++)
		{
			for (k = i + 1;k < n;k++)
			{
				if (A[i] == A[k])
				{
				A[k] = -100;
				}
			}
		}
		System.out.printf("%d",A[0]);
		for (k = 1;k < n;k++)
		{
		if (A[k] != (-100))
		{
			System.out.printf(",%d",A[k]);
		}

		}
		return 0;
	}
}

