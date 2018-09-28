package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int i1;
		int j1;
		int i2;
		int i3;
		int j3;
		int p = 0;
		int q = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i2 = 0;i2 <= n - 1;i2++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			for (i1 = 0;i1 <= i - 1;i1++)
			{
				for (j1 = 0;j1 <= j - 1;j1++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i1][j1] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i3 = 0;i3 <= j - 1;i3++)
			{
				sum = sum + a[0][i3] + a[i - 1][i3];
			}
			for (j3 = 0;j3 <= i - 1;j3++)
			{
				sum = sum + a[j3][0] + a[j3][j - 1];
			}
			sum = sum - a[0][j - 1] - a[i - 1][0] - a[i - 1][j - 1] - a[0][0];
			System.out.printf("%d\n",sum);
			sum = 0;
			for (i1 = 0;i1 <= i - 1;i1++)
			{
				for (j1 = 0;j1 <= j - 1;j1++)
				{
					a[i1][j1] = 0;
				}
			}

		}
		return 0;
	}
}

