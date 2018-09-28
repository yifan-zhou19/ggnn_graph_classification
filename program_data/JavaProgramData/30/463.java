package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int sum = 0;
		int a;
		int b;
		int c;
		int d;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n <= 70)
		{
			for (k = 1;k <= n;k++)
			{
				a = k - 7;
				if (k % 7 != 0 && a % 10 != 0)
				{
					sum = sum + k * k;
				}
			}
			System.out.print(sum);
		}
		if (n > 70 && n < 80)
		{
			for (k = 1;k <= 70;k++)
			{
				b = k - 7;
				if (k % 7 != 0 && b % 10 != 0)
				{
					sum = sum + k * k;
				}
			}
			System.out.print(sum);
		}
		if (n >= 80)
		{
			for (k = 1;k <= 70;k++)
			{
				c = k - 7;
				if (k % 7 != 0 && c % 10 != 0)
				{
					sum = sum + k * k;
				}
			}
			for (k = 80;k <= n;k++)
			{
				d = k - 7;
				if (k % 7 != 0 && d % 10 != 0)
				{
					sum = sum + k * k;
				}
			}
			System.out.print(sum);
		}
		return 0;
	}
}

