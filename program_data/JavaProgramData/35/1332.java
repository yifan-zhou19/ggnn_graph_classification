package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int h = 0;
		int m;
		int n;
		int r = 0;
		int[][] a = new int[8][8];
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0,k = 0;j < n;j++)
			{
				if (a[i][j] > a[i][0])
				{
					k = j;
				}
			}
			for (j = 0,h = 0;j < m;j++)
			{
				if (a[j][k] < a[0][k])
				{
					h = j;
				}
			}
			if (h == i)
			{
				System.out.printf("%d+%d\n",i,k);
				r = 1;
				break;
			}
		}
		if (r == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

