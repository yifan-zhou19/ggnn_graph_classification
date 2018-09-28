package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int y;
		int m1;
		int m2;
		int sum;
		for (int i = 1;i <= n;i++)
		{
			sum = 0;
			int temp;
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				temp = m1;
				m1 = m2;
				m2 = temp;

			}
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			{
				for (int s = m1 - 1;s <= m2 - 2;s++)
				{
					sum = sum + b[s];
				}
			}
			else
			{
				for (int s = m1 - 1;s <= m2 - 2;s++)
				{
					sum = sum + a[s];
				}
			}
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
		return 0;
	}

}

