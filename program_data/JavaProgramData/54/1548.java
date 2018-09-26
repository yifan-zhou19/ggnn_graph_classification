package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;;i++)
		{
			int t;
			a = n * i + k;
			for (t = 0;t < n;t++)
			{
				if (a % (n - 1) == 0)
				{
					a = a * n / (n - 1) + k;
					continue;
				}
				else
				{
					break;
				}
			}
			if (t == n - 1)
			{
				System.out.print(a);
			break;
			}
			else
			{
				continue;
			}
		}
		return 0;
	}
}

