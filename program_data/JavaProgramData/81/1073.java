package <missing>;

public class GlobalMembers
{
	public static int f(int n, int m, int[] p)
	{
		int t;
		int i;
		if (0 <= m != 0 && m < 5 && 0 <= n != 0 && n < 5)
		{
			for (i = 0;i < 5;i++)
			{
				t = (p[m] + i);
				*(p[m] + i) = *(p[n] + i);
				*(p[n] + i) = t;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int flag;
		int n;
		int m;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
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
		flag = f(n, m, a);
		if (flag == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j == 4)
					{
						System.out.print("\n");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
		}
		return 0;
	}
}

