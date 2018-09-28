package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] z = new int[9][9];
		int m;
		int n;
		int max;
		int min;
		int i;
		int j;
		int a = 0;
		int b = 0;
		int p;
		int q;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					z[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < m;i++)
		{
			a = 0;
			max = z[i][0];
			q = 0;
			for (j = 0;j < n;j++)
			{
				if (z[i][j] > max)
				{
					max = z[i][j];
					q = j;
				}
			}
			min = max;
			for (p = 0;p < m;p++)
			{
				if (z[p][q] < min)
				{
					a = 1;
					break;
				}
			}
			if (a == 0)
			{
				b++;
				System.out.printf("%d+%d\n",i,q);
				break;
			}
		}

		if (b == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

