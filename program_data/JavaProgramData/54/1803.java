package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int[] apple = new int[1000];

	public static int divide(int monkey)
	{
		if (monkey == 0)
		{
			apple[0] += n * (n - 1);
			return divide(1);
		}
		else
		{
			apple[monkey] = apple[monkey - 1] * n / (n - 1) + k;
			if (monkey == n - 1)
			{
				return apple[monkey];
			}
			else
			{
				if (apple[monkey] % (n - 1) == 0)
				{
					return divide(monkey + 1);
				}
				else
				{
					return divide(0);
				}
			}
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple[0] = k + (n - 1 - k) * n;
		if (n <= 1)
		{
			System.out.print(k);
		}
		else
		{
		System.out.print(divide(0));
		}
		return 0;
	}

}

