package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int sum;
		int sum1;

		sum = sum1 = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
			{

				sum = sum + i * i;
			}

			else
			{

				sum = sum;
			}

			sum1 = sum1 + i * i;
		}

			sum = sum1 - sum;

			System.out.print(sum);
			System.out.print("\n");

			return 0;
	}
}

