package <missing>;

public class GlobalMembers
{
	public static int F(int n, int m)
	{
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int m;
		int r;
		int i;
		int[][] jz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (r = 0;r < 5;r++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					jz[i][r] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (F(n, m) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				r = jz[m][i];
				jz[m][i] = jz[n][i];
				jz[n][i] = r;
			}
			for (i = 0;i < 5;i++)
			{
				for (r = 0;r < 4;r++)
				{
					System.out.printf("%d ",jz[i][r]);
				}
				System.out.printf("%d\n",jz[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

