package <missing>;

public class GlobalMembers
{
	public static void q(int[][] a, int m, int n)
	{
		int i;
		int b;
		for (i = 0;i < 5;i++)
		{
			b = a[m][i];
			a[m][i] = a[n][i];
			a[n][i] = b;
		}
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int c;
		int d;
		int e;
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
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if (m >= 5 || n >= 5)
		{
			System.out.print("error\n");
			return 0;
		}
		else
		{
			q(a, m, n);

		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d",a[i][0]);

			for (j = 1;j < 5;j++)
			{
				System.out.printf(" %d",a[i][j]);
			}
			System.out.print("\n");
		}
		}
		return 0;
	}




}

