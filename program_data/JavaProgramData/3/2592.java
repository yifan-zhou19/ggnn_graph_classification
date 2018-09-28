package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[][] sz = new int[1000][1000];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			b[i] = a[i];
		}
		int m = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				sz[i][j] = a[i] + b[j];
				if (sz[i][j] == k)
				{
					m = 1;
				}
			}
		}
		if (m == 1)
		{
			System.out.print("yes");
		}
		if (m == 0)
		{
			System.out.print("no");
		}



		return 0;
	}
}

