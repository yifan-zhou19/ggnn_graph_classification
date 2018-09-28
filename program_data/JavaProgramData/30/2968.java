package <missing>;

public class GlobalMembers
{
	public static int pd(int i)
	{
		if (i % 7 == 0)
		{
			return 0;
		}
		while (i != 0)
		{
			if (i % 10 == 7)
			{
				return 0;
			}
			i /= 10;
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (pd(i) != 0)
			{
			sum += i * i;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}

}

