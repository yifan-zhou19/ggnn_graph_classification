package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		System.out.printf("%d",sz[n - m]);
		 for (j = m - 2;j >= 0;j--)
		 {
			System.out.printf(" %d",sz[n - 1 - j]);
		 }
		for (int a = m + 1;a <= n;a++)
		{
			System.out.printf(" %d",sz[a - m - 1]);
		}

		return 0;
	}

}

