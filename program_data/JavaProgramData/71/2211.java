package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y;
		int m1;
		int m2;
		int i;
		int j;
		int n;
		int sum1 = 0;
		int sum2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				a[1] = 29;
			}
			else
			{
				a[1] = 28;
			}
			if (m1 > m2)
			{
				for (j = m2 - 1;j <= m1 - 2;j++)
				{
					sum1 = sum1 + a[j];
				}
				if (sum1 % 7 == 0)
				{
					System.out.print("YES");
					System.out.print('\n');
				}
				else if (sum1 % 7 != 0)
				{
					System.out.print("NO");
					System.out.print('\n');
				}
				sum1 = 0;
			}
			if (m1 < m2)
			{
				for (j = m1 - 1;j <= m2 - 2;j++)
				{
					sum2 = sum2 + a[j];
				}
				if (sum2 % 7 == 0)
				{
					System.out.print("YES");
					System.out.print('\n');
				}
				else if (sum2 % 7 != 0)
				{
					System.out.print("NO");
					System.out.print('\n');
				}
				sum2 = 0;
			}
		}

		return 0;
	}

}

