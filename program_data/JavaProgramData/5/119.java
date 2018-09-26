package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int p;
		int m;
		int k = 0;
		int[] cd = new int[2];
		double s;
		char[][] sz = new char[2][505];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
		}
		for (i = 0;i < 2;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = tempVar2.charAt(0);
			}
			cd[i] = String.valueOf(sz[i]).length();
		}
		for (i = 0;i < 2;i++)
		{
			for (j = 0;j < cd[i];j++)
			{
				if (sz[i][j] != 'A' && sz[i][j] != 'T' && sz[i][j] != 'C' && sz[i][j] != 'G')
				{
					k++;
				}
			}
		}
		if (cd[0] != cd[1])
		{
			k++;
		}
		if (k != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < cd[0];j++)
			{
				if (sz[0][j] == sz[1][j])
				{
					k++;
				}
			}
			p = k * 100 / cd[0];
			if (p > 100 * s)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		return 0;
	}

}

