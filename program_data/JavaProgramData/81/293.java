package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int[][] a = new int[5][5];
		int b;
		int m;
		int n;
		int change = new int(int m,int n);
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (change(m, n) == 0)
		{
		System.out.print("error");
		}
		if (change(m, n) == 1)
		{
			for (i = 0;i < 5;i++)
			{
			b = a[m][i];
		a[m][i] = a[n][i];
		a[n][i] = b;
			}

			for (i = 0;i < 5;i++)
			{
			for (j = 0;j < 5;j++)
			{
				System.out.printf("%d%c",a[i][j],(j != 4)?' ':'\n');
			}
			}
		}

	}
	public static int change(int m,int n)
	{
		int y;
		if (m > 4 || n > 4)
		{
		y = 0;
		}
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
		y = 1;
		}
		return (y);
	}



}

