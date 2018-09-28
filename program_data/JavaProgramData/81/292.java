package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static changeline(int[][] a, int m, int n)
	{
		int i;
		int t;
		if (m <= 4 && n <= 4)
		{
			for (i = 0;i < 5;i++)
			{
				t = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = t;
			}
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		{
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
		if (changeline(a,m,n))
		{
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
			System.out.print("error\n");
				}
	}
}

