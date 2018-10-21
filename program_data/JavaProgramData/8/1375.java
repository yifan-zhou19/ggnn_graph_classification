package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[2][5000];
	public static int[] b = new int[2];
	public static int k;
	public static void ppt(int k)
	{
		for (int i = 0;i < b[k] - 1;i++)
		{
			for (int j = 0;j < b[k] - 1 - i;j++)
			{
				if (a[k][j] > a[k][j + 1])
				{
					int tr;
						tr = a[k][j];
						a[k][j] = a[k][j + 1];
						a[k][j + 1] = tr;
				}
			}
		}
	}

	public static int Main()
	{
		b[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k <= 1;k++)
		{
			for (int m = 0;m < b[k];m++)
			{
				a[k][m] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			ppt(k);
			for (int m = 0;m < b[k];m++)
			{
					if (k == 0 && m == 0)
					{
						System.out.print(a[k][m]);
					}
					else
					{
						System.out.print(" ");
						System.out.print(a[k][m]);
					}
			}
		}
	return 0;
	}
}

