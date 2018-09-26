package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int k;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i += 2)
		{
			j = m - i;
			for (k = 2; k < i; k++)
			{
				if (i % k == 0)
				{
					break;
				}
			else
			{
				if (k > Math.sqrt(i))
				{
					for (n = 3; n < j; n += 2)
					{
						if (j % n == 0)
						{
							break;
						}
					}
						if (n > Math.sqrt(j))
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
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

