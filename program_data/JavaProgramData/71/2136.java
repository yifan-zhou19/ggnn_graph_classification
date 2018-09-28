package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int y;
		int m1;
		int m2;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			k = 0;
			if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
			{
				if (m1 > m2)
				{
					for (int j = m2;j < m1;j++)
					{
						k += a[j - 1];
					}
				}
				else
				{
					for (int j = m1;j < m2;j++)
					{
						k += a[j - 1];
					}
				}
			}
			else
			{
				if (m1 > m2)
				{
					for (int j = m2;j < m1;j++)
					{
						k += b[j - 1];
					}
				}
				else
				{
					for (int j = m1;j < m2;j++)
					{
						k += b[j - 1];
					}
				}
			}
			if (k % 7 == 0)
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
		return 0;
	}
}

