package <missing>;

public class GlobalMembers
{
	public static int A(int m,int n)
	{
		int a;
		if (0 <= m != 0 && m <= 4 && 0 <= n != 0 && n <= 4)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return (a);
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] f = new int[5][5];
		int[] b = new int[5];
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					f[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (A(m, n) == 1)
			{
				if (m != n)
				{
					for (j = 0;j <= 4;j++)
					{
						b[j] = f[m][j];
						f[m][j] = f[n][j];
						f[n][j] = b[j];
					}
				}
				for (i = 0;i <= 4;i++)
				{
					for (j = 0;j <= 3;j++)
					{
						System.out.printf("%d ",f[i][j]);
					}
					System.out.printf("%d\n",f[i][4]);
				}
			}
			else
			{
				System.out.print("error");
			}
	}



}

