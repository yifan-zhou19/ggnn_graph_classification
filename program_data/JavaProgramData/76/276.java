package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[50000][2];
		int[] min = new int[2];
		int i;
		int j;
		int t;
		int m = 0;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (a[j][0] > a[j + 1][0])
				{
					t = a[j][0];
					a[j][0] = a[j + 1][0];
					a[j + 1][0] = t;
					t = a[j][1];
					a[j][1] = a[j + 1][1];
					a[j + 1][1] = t;
				}
			}
		}
		min[0] = a[0][0];
		min[1] = a[0][1];
		for (i = 1;i < n;i++)
		{
			if (a[i][0] > min[1] || a[i][1] < min[0])
			{
				System.out.print("no\n");
				m = 1;
				break;
			}
			else
			{
				if (a[i][0] < min[0])
				{
				min[0] = a[i][0];
				}
				if (a[i][1] > min[1])
				{
				min[1] = a[i][1];
				}
			}
		}
		if (m == 0)
		{
		System.out.printf("%d %d\n",min[0],min[1]);
		}

		return 0;
	}

}

