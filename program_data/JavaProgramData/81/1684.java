package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int i;
		int k;
		int e;
		int a;
		int n;
		int m;
		for (k = 0;k < 5;k++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[k][i] = Integer.parseInt(tempVar);
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
		if (n < 5 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
				e = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = e;
			}
			a = 1;
		}
		else
		{
			a = 0;
		}
		if (a == 1)
		{
			for (k = 0;k < 5;k++)
			{
				System.out.printf("%d %d %d %d %d\n",sz[k][0],sz[k][1],sz[k][2],sz[k][3],sz[k][4]);
			}
		}
		else if (a == 0)
		{
			System.out.print("error");
		}
		return 0;
	}
}

