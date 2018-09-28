package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int T;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= n;i++)
		{
			T = 0;
			j = 1;
			while (a[i][j] != 0)
			{
					if ((a[i][j] - a[i][j - 1] + T) <= 60)
					{
			if ((a[i][j] - a[i][j - 1] + T + 3) <= 60)
			{
				T = T + a[i][j] - a[i][j - 1] + 3;
				j++;
			}
			else
			{
				break;
			}
					}
				else
				{
					break;
				}
			}
			if (a[i][j] != 0 && (a[i][j] - a[i][j - 1] + T) <= 60)
			{
				b[i] = a[i][j];
			}
			else
			{
				b[i] = a[i][j - 1] + 60 - T;
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

