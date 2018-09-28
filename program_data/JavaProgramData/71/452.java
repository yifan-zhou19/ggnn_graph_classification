package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int y;
		int m1;
		int m2;
		int sum;
		int sum1;
		int sum2;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			sum1 = 0;
			sum2 = 0;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			{
				for (j = 0;j <= m1 - 1;j++)
				{
					sum1 += b[j];
				}
				for (j = 0;j <= m2 - 1;j++)
				{
					sum2 += b[j];
				}
				sum = sum2 - sum1;
				if (sum % 7 == 0)
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
				for (j = 0;j <= m1 - 1;j++)
				{
					sum1 += a[j];
				}
				for (j = 0;j <= m2 - 1;j++)
				{
					sum2 += a[j];
				}
				sum = sum2 - sum1;
				if (sum % 7 == 0)
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

