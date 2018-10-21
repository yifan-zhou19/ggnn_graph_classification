package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int year;
			int mon1;
			int mon2;
			int sum = 0;
			int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				a[2] = 29;
			}
			if (mon1 > mon2)
			{
				int t;
				t = mon1;
				mon1 = mon2;
				mon2 = t;
			}
			for (int i = mon1;i < mon2;i++)
			{
				sum = sum + a[i];
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

