package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int m;
		int n;
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
		if (m > 4 || n > 4)
		{
			System.out.print("error");
		}
		else if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{

			for (j = 0;j < 5;j++)
			{
				int t;
				t = a[n][j];
				a[n][j] = a[m][j];
				a[m][j] = t;
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
				System.out.printf("%d ",a[i][j]);
				}
				for (j = 4;j < 5;j++)
				{
					System.out.printf("%d",a[i][j]);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

