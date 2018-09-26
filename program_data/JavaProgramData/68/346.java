package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int m;
		for (m = 2;m <= Math.sqrt(n);m++)
		{
			if (n % m == 0)
			{
				return 0;
			}
		}
			return 1;
	}
	public static int Main()
	{
		int n;
		int i;
		int temp1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6;i <= n;i++)
		{
			if (i % 2 == 0)
			{
				for (temp1 = 2;temp1 < i;temp1++)
				{
					if (prime(temp1) != 0)
					{
						if (prime(i - temp1) != 0)
						{
							System.out.print(i);
							System.out.print("=");
							System.out.print(temp1);
							System.out.print("+");
							System.out.print(i - temp1);
							System.out.print("\n");
							break;
						}
					}
				}
			}
		}
		return 0;
	}

}

