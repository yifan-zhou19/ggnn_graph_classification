package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int a;
		int b = 0;
		int c = 0;
		int[][] p = new int[10][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			a = 0;
			for (i = 0;i < m;i++)
			{
				if (p[j][i] > a)
				{
					a = p[j][i];
				}
			}
			for (i = 0;i < m;i++)
			{
				if (p[j][i] == a)
				{
					for (k = 0;k < n;k++)
					{
						if (p[k][i] < a)
						{
							b = 1;
						}
					}
					if (b == 0)
					{
						System.out.printf("%d+%d",j,i);
						c = 1;
					}
				}
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
	}

}

