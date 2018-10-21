package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[MAX];
		int[][] sum = new int[MAX][MAX];
		int i;
		int j;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				sum[i][j] = x[i] + x[j];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sum[i][j] == k && i != j)
				{
					System.out.print("yes");
					return 0;
				}
			}
		}
		System.out.print("no");
		return 0;
	}
}

