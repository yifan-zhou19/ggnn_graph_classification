package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int s;
		int m = 1;
		int g = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;g != n;m++)
		{
			g = 0;
			s = m;
			for (int i = 0;i < n;i++)
			{
				if (m % (n - 1) == 0)
				{
					m = m * n / (n - 1) + k;
					g++;
					if (g == n)
					{
				System.out.print(m);
				break;
					}
				}
				else
				{
					break;
				}
			}
			m = s;
		}
		return 0;
	}
}

