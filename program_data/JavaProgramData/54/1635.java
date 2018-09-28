package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int k;
		int g = 1;
		int i = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (g == 1)
		{
			g = 0;
			m = i * n + k;
			i++;
			if (m % (n - 1) != 0)
			{
				g = 1;
			}
			else
			{
			for (int j = 2; j <= n - 1; j++)
			{
				m = m * n / (n - 1) + k;
				if (m % (n - 1) != 0)
				{
					g = 1;
					break;
				}
			}
			}
			m = m * n / (n - 1) + k;
		}
		System.out.print(m);
		return 0;
	}





}

