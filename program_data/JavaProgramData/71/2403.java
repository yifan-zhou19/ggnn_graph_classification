package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int year;
		int m1;
		int m2;
		int t;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = 0;
			if (m1 > m2)
			{
					m = m1;
					m1 = m2;
					m2 = m;
			}
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
				for (j = m1;j < m2;j++)
				{
					t = t + a[j];
				}
				if (t % 7 == 0)
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
				int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
				for (j = m1;j < m2;j++)
				{
					t = t + a[j];
				}
				if (t % 7 == 0)
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

