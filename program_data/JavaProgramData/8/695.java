package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[2][11];
	public static int geshu1;
	public static int geshu2;
	public static int hanshu1()
	{
		int i;
		geshu1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		geshu2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < geshu1;i++)
		{
			a[0][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < geshu2;i++)
		{
			a[1][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		return 0;

	}
	public static int hanshu2()
	{
		int i;
		int j;
		int k;
		for (i = geshu1 - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[0][j] > a[0][j + 1])
				{
					k = a[0][j];
					a[0][j] = a[0][j + 1];
					a[0][j + 1] = k;
				}
			}
		}
		for (i = geshu2 - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (a[1][j] > a[1][j + 1])
				{
					k = a[1][j];
					a[1][j] = a[1][j + 1];
					a[1][j + 1] = k;
				}
			}
		}
		return 0;
	}
	public static int hanshu3()
	{
		int i;
		for (i = 0;i < geshu2;i++)
		{
			a[0][geshu1 + i] = a[1][i];
		}
		return 0;
	}
	public static int hanshu4()
	{
		int i;
		System.out.print(a[0][0]);
		for (i = 1;i < geshu1 + geshu2;i++)
		{
			System.out.print(" ");
			System.out.print(a[0][i]);
		}
		return 0;
	}
	public static int Main()
	{
		hanshu1();
		hanshu2();
		hanshu3();
		hanshu4();
		return 0;
	}
}

