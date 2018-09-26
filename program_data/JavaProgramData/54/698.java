package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;

	public static int Main()
	{

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int t = 0;
		while (true)
		{
			t++;
		int i = 1;
		int r = t * n + k;

		while (i < n)
		{

			if (r * n % (n - 1) != 0)
			{
				break;
			}
			r = r * n / (n - 1) + k;
			i++;
		}

		if (i == n)
		{
		System.out.print(r);
		break;
		}

		}

	}
}

