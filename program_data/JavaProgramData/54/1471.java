package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int a;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;;i++)
		{
			a = i * n + k;
			for (j = 1;j < n;j++)
			{
				if ((n * a) % (n - 1) == 0)
				{
					a = n * a / (n - 1) + k;
				}
				else
				{
					a = 0;
					break;
				}
			}
			if (a == 0)
			{
				continue;
			}
			else
			{
				System.out.print(a);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}
}

