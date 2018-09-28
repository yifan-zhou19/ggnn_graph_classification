package <missing>;

public class GlobalMembers
{
	public static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= n;i++)
		{
			int y;
			int m1;
			int m2;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				int m = m1;
				m1 = m2;
				m2 = m;
			}
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				int count = 0;
				for (j = m1;j <= m2 - 1;j++)
				{
					count = count + b[j];
				}
				if (count % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
			else
			{
				int count = 0;
				for (j = m1;j <= m2 - 1;j++)
				{
					count = count + a[j];
				}
				if (count % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

