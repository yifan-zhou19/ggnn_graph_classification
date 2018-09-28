package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a = 9;
		int b;
		int c = 0;
		int k;
		int m;
		int n;
		int[][] num = new int[8][8];
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
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			k = 0;
			for (j = 0;j < n;j++)
			{
				if (k < num[i][j])
				{
					k = num[i][j];
					b = j;
				}
			}
			for (j = 0;j < m;j++)
			{
				if ((a != 2) && (k <= num[j][b]))
				{
					a = 1;
				}
				else
				{
					a = 2;
				}
			}
			if (a == 1)
			{
				System.out.printf("%d+%d",i,b);
				c = 1;
				break;
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}



		return 0;
	}

}

