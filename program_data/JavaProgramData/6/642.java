package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int sum;
		int x;
		int y;
		int[] a = new int[100];
		int[] b = new int[100];
		int[][] ar = new int[100][100];
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
			x = a[i] - 1;
			y = b[i] - 1;
			for (j = 0;j < a[i];j++)
			{
				for (k = 0;k < b[i];k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						ar[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
			sum = 0;
			for (j = 0;j < a[i];j++)
			{
				sum = sum + ar[j][0] + ar[j][y];
			}
			for (k = 0;k < b[i];k++)
			{
				sum = sum + ar[0][k] + ar[x][k];
			}
			sum = sum - ar[0][0] - ar[0][y] - ar[x][0] - ar[x][y];
			System.out.printf("%d\n",sum);
			sum = 0;
		}
		return 0;
	}
}

