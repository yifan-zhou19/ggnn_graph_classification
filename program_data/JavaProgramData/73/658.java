package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int e = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			m = 0;
			for (j = 0;j < 5;j++)
			{
				if (m < a[i][j])
				{
					m = a[i][j];
				}
			}
			for (j = 0;j < 5;j++)
			{
				if (a[i][j] == m)
				{
					b[i][j] = 1;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			m = 1073741824;
			for (i = 0;i < 5;i++)
			{
				if (m > a[i][j])
				{
					m = a[i][j];
				}
			}
			for (i = 0;i < 5;i++)
			{
				if (a[i][j] == m)
				{
					b[i][j] *= -1;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (b[i][j] == -1)
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					e = 1;
				}
			}
		}
		if (e == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

