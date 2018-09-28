package <missing>;

public class GlobalMembers
{
	public static int hanshu(int m, int n)
	{
		int result;
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[] b = new int[5];
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
		int m;
		int n;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (hanshu(m, n) == 1)
		{
			for (j = 0;j < 5;j++)
			{
				b[j] = a[m][j];
				a[m][j] = a[n][j];
				a[n][j] = b[j];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);
				}
				System.out.printf("%d\n",a[i][4]);
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

