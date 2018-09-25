package <missing>;

public class GlobalMembers
{
	public static int cube(int[][] a, int n, int m)
	{
		int[] c = new int[5];
		int i;
		if (m < 5 && m >= 0 && n < 5 && n >= 0)
		{
			for (i = 0;i < 5;i++)
			{
				c[i] = a[m][i];
				a[m][i] = a[n][i];
				a[n][i] = c[i];
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
		int[][] a = new int[5][5];
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
		if (cube(a, n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					System.out.printf("%d%c",a[i][j],(j < 4)?' ':'\n');
				}
			}
		}
	}

}

