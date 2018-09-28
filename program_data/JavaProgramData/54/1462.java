package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;;i++)
		{
			m = i * n + k;
			for (j = 1;j < n;j++)
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
			if (j == n)
			{
			break;
			}
		}
		System.out.print(m);

		return 0;
	}

}

