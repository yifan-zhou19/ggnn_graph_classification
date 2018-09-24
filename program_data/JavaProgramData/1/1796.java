package <missing>;

public class GlobalMembers
{
	public static int breakways(int num, int min)
	{
		int sum = 0;
		for (int j = min ;j <= num ; j++)
		{
			if (num % j == 0)
			{
				if (num != j)
				{
					sum += breakways(num / j, j);
				}
				else
				{
					sum += 1;
				}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int number;
		for (int i = 1; i <= n ; i++)
		{
			number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(breakways(number, 2));
			System.out.print("\n");
		}
	}
}

