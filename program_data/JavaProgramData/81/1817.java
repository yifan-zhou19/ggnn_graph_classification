package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[5][5];
	public static int gmm(int n,int m)
	{
		int t;
		int i;
		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{
			t = a[m][i];
			a[m][i] = a[n][i];
			a[n][i] = t;
			}

			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{

		int n;
		int m;
		int i;
		int j;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (gmm(n, m) == 0)
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
					if (j != 4)
					{
						System.out.print(" ");
					}
				}
				System.out.print("\n");
			}
		}
	}


}

