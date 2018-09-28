package <missing>;

public class GlobalMembers
{
	public static int pd(int x, int y)
	{
		if ((n >= 0 && n < 5) && (m >= 0 && m < 5))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);


	}
	public static int[][] a = new int[5][5];
	public static int i;
	public static int j;
	public static int n;
	public static int m;
	public static int x;
	public static int y;
	public static int z;
	public static int c;
	public static int[] b = new int[5];



	public static void Main()
	{
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
		c = pd(n, m);
		if (c == 0)
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
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",a[i][j]);

				}
				System.out.printf("%d\n",a[i][4]);

			}

		}

	}
}

