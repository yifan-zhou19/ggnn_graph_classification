package <missing>;

public class GlobalMembers
{
	//????
	//2010?12?03?
	//1000012753 ???
	public static int deal(int num, int p)
	{
		int i;
		int sum = 0;
		if (num == 1)
		{
			return 1;
		}
		for (i = p; i <= num; ++i)
		{
			if (num % i == 0)
			{
				sum += deal(num / i, i);
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(deal(a, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

