package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] x = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] a = new int[100][100];
		int sum;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a[i][j] = 70;
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < x[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			sum = 60 - j * 3;
			while ((a[i][j] + 3 * j) < 58 && j < x[i])
			{
				j++;
				sum = 60 - j * 3;
			}
			if ((a[i][j] + 3 * j) < 60)
			{
				sum = sum - (60 - (a[i][j] + 3 * j));
			}
			System.out.printf("%d\n",sum);
		}
	}
}

