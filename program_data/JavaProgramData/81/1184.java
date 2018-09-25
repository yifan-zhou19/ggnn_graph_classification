package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int a;
		int[][] c = new int[5][5];
		int m;
		int n;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					c[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m < 5 && n < 5 && m >= 0 && n >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				a = c[m][i];
				c[m][i] = c[n][i];
				c[n][i] = a;
			}
			for (i = 0;i < 5;i++)
			{
				if (i != 0)
				{
					System.out.print("\n");
				}
				System.out.printf("%d",c[i][0]);
				for (k = 1;k < 5;k++)
				{
					System.out.printf(" %d",c[i][k]);
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		//scanf("%d",&n);
		return 0;
	}

}

