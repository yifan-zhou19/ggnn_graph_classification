package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] an = {4, 2, 8, 1, 4, 7, 3, 7, 0, 1, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int carry = 0;
		int dig;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n <= 30)
		{
			System.out.print((int)Math.pow((double)2,(double)n));
			System.out.print("\n");
		}
		else
		{
			n = n - 30;
			for (int i = 0;i < n;i++)
			{
				carry = 0;
				for (dig = 0;an[dig] + 1;dig++)
				{
					an[dig] = an[dig] * 2 + carry;
					carry = an[dig] / 10;
					an[dig] = an[dig] % 10;
				}
				if (carry != 0)
				{
					an[dig] = carry;
					an[dig + 1] = -1;
				}
			}
			int st;
			for (st = 100;an[st] != -1;st--)
			{
			}
			for (int i = st - 1;i >= 0;i--)
			{
				System.out.print(an[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

