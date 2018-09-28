package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (j = 0;j < 5;j++)
			{
				b[j] = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = b[j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ", a[i][j]);
				}
				if ((j = 4) != 0)
				{
					System.out.printf("%d\n", a[i][j]);
				}
			}
		}
		else
		{
			System.out.print("error");
		}
	}


}

