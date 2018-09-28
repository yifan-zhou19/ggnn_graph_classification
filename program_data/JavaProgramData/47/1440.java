package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] SZ = new int[100];
		int[] ZS = new int[100];
		int n;
		int m = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(SZ[i]) = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(SZ[n - 1]) = Integer.parseInt(tempVar3);
		}
		while (n > 0)
		{
			ZS[m] = SZ[n - 1];
			n--;
			m++;
		}
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d ",ZS[i]);
		}
		System.out.printf("%d",ZS[m - 1]);
		return 0;
	}
}

