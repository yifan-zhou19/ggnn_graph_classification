package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i <= 10)
			{
				if (i != 7)
				{
					sum1 = sum1 + i * i;
				}
				else
				{
					sum1 = sum1;
				}
			}
			if (i > 10)
			{
				if (i % 7 != 0 && i / 10 != 7 && (i - 10 * (i / 10)) != 7)
				{
				sum2 = sum2 + i * i;
				}
				else
				{
				sum2 = sum2;
				}
			}
		}
		System.out.print(sum1 + sum2);
		System.out.print("\n");
		return 0;
	}

}

