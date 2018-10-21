package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int year;
		int mon1;
		int mon2;
		int sum;
		int c;
		int d;
		int[] Lyear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] Oyear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			sum = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = (mon1 > mon2 != 0 ? mon2 : mon1);
			d = (mon1 > mon2 != 0 ? mon1 : mon2);
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				for (int j = c; j < d; j++)
				{
					sum = sum + Lyear[j - 1];
				}
			}
			else
			{
				for (int k = c; k < d; k++)
				{
					sum = sum + Oyear[k - 1];
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

