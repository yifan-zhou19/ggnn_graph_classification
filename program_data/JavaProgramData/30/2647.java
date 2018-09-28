package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum1 = 0;
		int sum2 = 0;
		int sum;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (((i >= 70) && (i < 80)) || (i % 7 == 0) || (i % 10 == 7))
			{
				sum1 = sum1 + i * i;
			}
		}
		for (i = 1;i <= n;i++)
		{
			sum2 = sum2 + i * i;
		}
		sum = sum2 - sum1;
		System.out.print(sum);
	}
}

