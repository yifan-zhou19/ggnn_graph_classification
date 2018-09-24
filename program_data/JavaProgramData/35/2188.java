package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[9][9];
		int m;
		int n;
		int i;
		int j;
		int[] max = new int[9];
		int[] r = new int[9];
		char z = '0';
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
					x[i][j] = Integer.parseInt(tempVar3);
				}
				if (x[i][j] >= max[i])
				{
					max[i] = x[i][j];
				r[i] = j;
				}
			}
		}
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < m;j++)
			{
				if (x[j][r[i]] < max[i])
				{
					break;
				}
			}
			if (j == m)
			{
				z = '1';
				System.out.printf("%d+%d",i,r[i]);
				break;
			}
			}
		if (z == '0')
		{
			System.out.print("No");
		}
	}


}

