package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int m;
		int t;
		int[] a = new int[13];
		int sum;
		for (int i = 1; i < 8; i = i + 2)
		{
			a[i] = 31;
		}
		a[8] = 31;
		a[10] = 31;
		a[12] = 31;
		a[4] = 30;
		a[6] = 30;
		a[9] = 30;
		a[11] = 30;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			if (m > t)
			{
				int j = m;
				m = t;
				t = j;
			}
			if (y % 100 == 0)
			{
				if (y / 100 % 4 == 0)
				{
					a[2] = 29;
				}
				else
				{
					a[2] = 28;
				}
			}
			else
			{
				if (y % 4 == 0)
				{
					a[2] = 29;
				}
				else
				{
					a[2] = 28;
				}
			}
			for (int i = m; i < t; i++)
			{
				sum = sum + a[i];
			}
			if (sum % 7 == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
			System.out.print("\n");
		}
		return 0;
	}
}

