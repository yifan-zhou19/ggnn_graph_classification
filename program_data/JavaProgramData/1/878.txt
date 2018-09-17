package <missing>;

public class GlobalMembers
{
	public static int prime(int min,int num)
	{
		int i;
		for (i = min;i < num;i++)
		{
			if (num % i == 0)
			{
				return 0;
			}
		}
	 return 1;
	}
	public static int count(int min,int num)
	{
		int i = 0;
		int n = 1;
		if (prime(min, num) != 0)
		{
			return 1;
		}
		else
		{
			for (i = min;i < num;i++)
			{
				if (num % i == 0 && i <= num / i)
				{
					n = n + count(i, num / i);
				}
			}
		}
		return n;
	}
	public static int Main()
	{
		int num;
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(count(2, num));
			System.out.print("\n");
		}
		return 0;

	}

}

