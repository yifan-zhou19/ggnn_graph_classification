package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[5][5];
		int[] e = new int[5];
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
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		if (n >= 0 && n < 5 && m >= 0 && m < 5)
		{
			for (i = 0;i < 5;i++)
			{

					e[i] = a[n][i];
			}
				for (i = 0;i < 5;i++)
				{

					a[n][i] = a[m][i];
				}
				for (i = 0;i < 5;i++)
				{

					a[m][i] = e[i];
				}
				for (i = 0;i < 5;i++)
				{
			for (j = 0;j < 5;j++)
			{
				if (j != 4)
				{
					System.out.printf("%d ",a[i][j]);
				}
				else
				{
					System.out.printf("%d",a[i][j]);
				}

			}
			System.out.print("\n");
				}
		}
		else
		{
			System.out.print("error");
		}

	}



}

