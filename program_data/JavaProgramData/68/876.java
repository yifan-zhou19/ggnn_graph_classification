package <missing>;

public class GlobalMembers
{
	public static int check(int k)
	{
		int i;
		int flag = 1;
		if (k % 2 == 0)
		{
			return 0;
		}
		for (i = 3;i * i <= k;i = i + 2)
		{
			if (k % i == 0)
			{
				flag = 0;
			}
		}

		if (flag == 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}

	}
	public static int Main()
	{
		int i;
		int j;
		int n;

		int limit;
		limit = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (n = 6;n <= limit;n = n + 2)
		{
		  for (i = 2;i <= n / 2;i++)
		  {
			if (check(i) != 0 && check(n - i) != 0)
			{
				System.out.print(n);
				System.out.print("=");
				System.out.print(i);
				System.out.print("+");
				System.out.print(n - i);
				if (n != limit)
				{
					System.out.print("\n");
				}
				break;
			}
		  }
		}


	}
}

