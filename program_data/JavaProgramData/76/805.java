package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int min;
		int max = 0;
		int j = 1;
		int k;
		int t = 0;
		int[][] a = new int[10001][2];
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
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		min = a[0][0];
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < (n - 1);k++)
			{
				if (a[k][0] > a[k + 1][0])
				{
					t = a[k][0];
					a[k][0] = a[k + 1][0];
					a[k + 1][0] = t;

				}
				if (a[k][1] > a[k + 1][1])
				{
					t = a[k][1];
					a[k][1] = a[k + 1][1];
					a[k + 1][1] = t;
				}

			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][1] > max)
			{
				max = a[i][1];
			}
			if (a[i][0] < min)
			{
				min = a[i][0];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (a[i - 1][1] < a[i][0])
			{
				j = 0;
				break;
			}

		}
		if (j == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

