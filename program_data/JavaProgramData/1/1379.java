package <missing>;

public class GlobalMembers
{
	public static int factorization(int num, int i)
	{
		int j;
		int squ;
		int sum = 1;
		squ = Math.sqrt((double) num);
		for (j = i; j <= squ; j++)
		{
			if (num % j == 0)
			{
				sum = sum + factorization(num / j, j);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int num;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(factorization(num, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

