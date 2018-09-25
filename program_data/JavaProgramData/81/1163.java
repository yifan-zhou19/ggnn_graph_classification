package <missing>;

public class GlobalMembers
{
	public static int jh(int a,int b)
	{
		if ((a < 5) && (a >= 0) && (b < 5) && (b >= 0))
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
		int m;
		int n;
		int i;
		int t;
		int k;
		int a;
		int b;
		int[][] sz = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		t = jh(a, b);
		if (t == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (k = 0;k < 5;k++)
			{
				m = sz[a][k];
				sz[a][k] = sz[b][k];
				sz[b][k] = m;
			}
		}
		if (t == 1)
		{
		 for (i = 0;i < 5;i++)
		 {
			for (k = 0;k < 5;k++)
			{
				if (k == 0)
				{
					System.out.printf("%d",sz[i][k]);
				}
				else if ((k != 4) && (k != 0))
				{
					System.out.printf(" %d",sz[i][k]);
				}
				else
				{
					System.out.printf(" %d\n",sz[i][k]);
				}
			}
		 }
		}
		return 0;
	}
}

