package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int apple;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple = k;
		do
		{
			apple += n;
			m = apple;
			for (i = n - 1;i >= 1;i--)
			{
				if (m % (n - 1) == 0)
				{
					m = m * n / (n - 1) + k;
				}
				else
				{
					break;
				}
			}
		} while (i >= 1);
		System.out.print(m);
		return 0;
	}
}

