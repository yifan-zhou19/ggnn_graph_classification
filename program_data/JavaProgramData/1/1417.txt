package <missing>;

public class GlobalMembers
{
	public static int a = 1;
	public static int yinzi(int j,int n)
	{
		for (int i = j;i < n;i++)
		{
			if (n % i == 0 && n != i && n / i >= i)
			{
					a++;
					yinzi(i, n / i);
			}

		}
		return 0;

	}
	public static int Main()
	{
		int n;
		int s;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < s;j++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 2;i <= n;i++)
			{
				if (n % i == 0 && n / i >= i)
				{
					a++;
					 yinzi(i, n / i);
				}
			}
			System.out.print(a);
			System.out.print("\n");
			a = 1;
		}
		return 0;
	}
}

