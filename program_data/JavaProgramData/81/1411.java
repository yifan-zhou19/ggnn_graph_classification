package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] juzhen = new int[5][5];
		int i;
		int j;
		int m;
		int n;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					juzhen[i][j] = Integer.parseInt(tempVar);
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
			int[] a = new int[5];
			int i;
			for (i = 0;i < 5;i++)
			{
				a[i] = juzhen[m][i];
				juzhen[m][i] = juzhen[n][i];
				juzhen[n][i] = a[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j == 4)
					{
						System.out.printf("%d",juzhen[i][j]);
					}
					else
					{
						System.out.printf("%d ",juzhen[i][j]);
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

