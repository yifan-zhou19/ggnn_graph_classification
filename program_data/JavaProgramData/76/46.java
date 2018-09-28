package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[number][2];
		int i;
		int j;
		int n;
		int c;
		int d;
		int min;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i <= n - 1; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0; i <= n - 2; i++)
		{
			for (j = 0; j <= n - 2 - i; j++)
			{
				if (a[j][0] > a[j + 1][0])
				{
					c = a[j][0];
					a[j][0] = a[j + 1][0];
					a[j + 1][0] = c;
					d = a[j][1];
					a[j][1] = a[j + 1][1];
					a[j + 1][1] = d;
				}
			}
		}
		min = a[0][0];
		max = a[0][1];
		for (i = 1; i <= n - 1; i++)
		{
			if (max < a[i][0])
			{
				System.out.print("no\n");
				return 0;
			}
			if (max < a[i][1])
			{
				max = a[i][1];
			}
		}
		System.out.printf("%d %d\n",min,max);
		return 0;
	}
}

