package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int flag = 0;
		int[][] a = new int[5][5];
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

		if (n < 5 && m < 5)
		{

		for (j = 0;j < 5;j++)
		{
			int tmp;
		tmp = a[n][j];
			a[n][j] = a[m][j];
			a[m][j] = tmp;
		}


		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j == 0)
				{
		System.out.printf("%d",a[i][j]);
				}
				else
				{
					System.out.printf(" %d",a[i][j]);
				}
			}
			System.out.print("\n");
		}
		}
		else
		{
			System.out.print("error");
		}

		return 0;
	}

}

