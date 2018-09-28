package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sza = new int[8][8];
		int[][] szb = new int[8][8];
		int i;
		int j;
		int x;
		int h;
		int l;
		int t;
		int[] hang = new int[8];
		int[] lie = new int[8];
		int p;
		int q;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x = Integer.parseInt(tempVar3);
				}
				sza[i][j] = x;
				szb[i][j] = x;
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l - 1;j++)
			{
					if (sza[i][j] > sza[i][j + 1])
					{
						t = sza[i][j + 1];
						sza[i][j + 1] = sza[i][j];
						sza[i][j] = t;
					}
					hang[i] = sza[i][l - 1];
			}
		}
		for (j = 0;j < l;j++)
		{
			for (i = h - 1;i > 0;i--)
			{
					if (szb[i][j] < szb[i - 1][j])
					{
						t = szb[i - 1][j];
						szb[i - 1][j] = szb[i][j];
						szb[i][j] = t;
					}
					lie[j] = szb[0][j];
			}
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				if (hang[i] == lie[j])
				{
					p = i;
					q = j;
					a = 1;
				}
			}
		}
		if (a == 1)
		{
			System.out.printf("%d+%d",p,q);
		}
		else
		{
			System.out.print("No");
		}
		return 0;
	}


}

