package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int N;
		double sum1 = 0;
		double sum2 = 0;
		double sum = 0;
		double restsum = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N < 70)
		{
		for (i = 1;i <= N;i++)
		{
			sum = sum + Math.pow((double)i,2.0);
		}
		n = (N - (N % 7)) / 7;
		for (i = 1;i <= n;i++)
		{
			sum1 = sum1 + 49 * (Math.pow((double)i,2.0));
		}
		m = (N - (N % 10)) / 10;
		if (N % 10 >= 7)
		{
		for (i = 1;i <= m;i++)
		{
			sum2 = sum2 + Math.pow((double)(10 * i + 7),2.0);
		}
		}
		else
		{
		for (i = 1;i <= m - 1;i++)
		{
			sum2 = sum2 + Math.pow((double)(10 * i + 7),2.0);
		}
		}
		restsum = sum - sum1 - sum2;
		System.out.print((int)restsum);
		System.out.print("\n");
		}
		else
		{
			if (N >= 80)
			{
				for (i = 1;i <= 69;i++)
				{
						sum = sum + Math.pow((double)i,2.0);
				}
					for (i = 1;i <= 9;i++)
					{
						sum1 = sum1 + 49 * (Math.pow((double)i,2.0));
					}
					for (i = 1;i <= 6;i++)
					{
						sum2 = sum2 + Math.pow((double)(10 * i + 7),2.0);
					}
					for (i = 80;i <= N;i++)
					{
							sum = sum + Math.pow((double)i,2.0);
					}
						n = (N - (N % 7)) / 7;
						for (i = 12;i <= n;i++)
						{
							sum1 = sum1 + 49 * (Math.pow((double)i,2.0));
						}
						m = (N - (N % 10)) / 10;
						if ((N % 10) >= 7)
						{
						for (i = 8;i <= m;i++)
						{
							sum2 = sum2 + Math.pow((double)(10 * i + 7),2.0);
						}
						}
						else
						{
						for (i = 8;i <= m - 1;i++)
						{
							sum2 = sum2 + Math.pow((double)(10 * i + 7),2.0);
						}
						}
						restsum = sum - sum1 - sum2;
						System.out.print((int)restsum);
						System.out.print("\n");
			}
			else
			{
				System.out.print(85596);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

