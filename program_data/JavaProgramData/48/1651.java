package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[11][11];
	public static int[][] backup_a = new int[11][11];
	public static int[][] b = new int[11][11];
	public static void backup1()
	{
		for (int i = 1;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				backup_a[i][j] = a[i][j];
				b[i][j] = a[i][j];
			}
		}

	}
	public static void cal1()
	{
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				if (i > 0 && i < 10 && j < 10 && j>0)
				{
					a[i][j] = b[i - 1][j - 1] + b[i - 1][j + 1] + b[i + 1][j - 1] + b[i + 1][j + 1] + b[i - 1][j] + b[i + 1][j] + b[i][j - 1] + b[i][j + 1] + 2 * b[i][j];
				}
			}
		}
	}

	public static int Main()
	{
		int n = 0;
		int d;
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		a[5][5] = d;
		backup1();

		for (int i = 0;i < n;i++)
		{
			cal1();
			backup1();
		}
		for (int i = 1;i < 10;i++)
		{
			for (int j = 1;j < 10;j++)
			{
				if (i > 0 && i < 10 && j < 10 && j>0)
				{
				if (j != 9)
				{
					System.out.print(a[i][j]);
					System.out.print(" ");
				}
				else if (j == 9)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				}
			}
		}

		return 0;

	}
}

