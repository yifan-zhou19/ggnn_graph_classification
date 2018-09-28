package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int p;
		int n;
		int m;
		int matrix = new int(int b[5][5],int e,int f);
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p = matrix(a, n, m);
		if (p == 1)
		{
			for (i = 0;i < 5;i++)
			{
				j = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = j;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
					if (j != 4)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("\n");
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
	}

	public static int matrix(int[][] b, int e, int g)
	{
		int f;
		if (e < 5 && g < 5)
		{
			f = 1;
		}
		else
		{
			f = 0;
		}
		return (f);
	}
}

