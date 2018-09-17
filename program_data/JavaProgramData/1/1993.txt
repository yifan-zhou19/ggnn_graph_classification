package <missing>;

public class GlobalMembers
{
	public static int p = 0;

	public static int factor(int a,int min)
	{
		int sum = 0;
		if (min >= a)
		{
			return 1;
		}
		for (int j = min;j <= a / min;j++)
		{
		if (a % j == 0)
		{
			sum += factor(a / j, j);
		}
		}
		return sum;
	}

	public static int Main()
	{
		int n = 0;
		int a = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a <= 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				System.out.print(factor(a, 2) + 1);
				System.out.print("\n");
			}
			n--;
		}
		return 0;
	}
}

