package <missing>;

public class GlobalMembers
{
	public static void go(int[][] a, int n, int m)
	{
		int[] b = new int[5];
		int i;
		int j;
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				b[i] = a[n][i];
				a[n][i] = a[m][i];
				a[m][i] = b[i];
			}
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

	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int n;
		int m;
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
		go(a, n, m);

		return 0;
	}

}

