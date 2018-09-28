package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int p;
		int[][] a = new int[6][6];
		int max;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			p = 0;
			max = a[i][0];
			t = 0;
			for (j = 1;j < 5;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					t = j;
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (max <= a[j][t])
				{
					p++;
				}
			}
			if (p == 5)
			{
				System.out.printf("%d %d %d",i + 1,t + 1,max);
				System.out.print("\n");
				break;
			}
		}
		if (i >= 5)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

