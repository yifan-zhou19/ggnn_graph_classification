package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[30][3];
		int i;
		int j;
		int n;
		int m;
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i][2] = 0;
		}
		a[1][2] = 1;
		m = 0;
		for (i = 2;i <= n;i++)
		{
			max = 0;
			for (j = 1;j <= i - 1;j++)
			{
				if ((a[j][1] >= a[i][1]) && (a[j][2] > max))
				{
					max = a[j][2];
				}
			}
			a[i][2] = max + 1;
			if (a[i][2] > m)
			{
				m = a[i][2];
			}
		}
		System.out.print(m);
		System.out.print("\n");
		return 0;
	}

}

