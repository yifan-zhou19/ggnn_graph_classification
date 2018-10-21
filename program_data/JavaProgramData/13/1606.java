package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20010];
		int[] b = new int[20010];
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ; i <= n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j <= m ;j++)
			{
				if (a[i] == b[j])
				{
					break;
				}
				if (j == m)
				{
					b[m] = a[i];
					m++;
					break;
				}
			}
		}
		for (i = 0 ; i < m; i++)
		{
			if (i == m - 1)
			{
				System.out.print(b[i]);
			}
			else
			{
				System.out.print(b[i]);
				System.out.print(" ");
			}
		}
	return 0;
	}
}

