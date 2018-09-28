package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int k;
		int t = 0;
		int i;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				k = m1;
				m1 = m2;
				m2 = k;
			}
			if (y % 4 != 0 || ((y % 100 == 0) && ((y % 400) != 0)))
			{
					for (i = m1;i < m2;i++)
					{
					t += a[i];
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
				for (i = m1;i < m2;i++)
				{
				t += b[i];
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
			t = 0;
		n--;
		}
		return 0;

	}
}

