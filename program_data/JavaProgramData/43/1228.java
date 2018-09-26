package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int l;
		double t;
		double s;
		for (i = 3;i <= n / 2;i += 2)
		{
			t = Math.sqrt((double)i);
			for (j = 2;j <= t;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > t)
			{
				l = n - i;
				s = Math.sqrt((double)l);
				for (k = 2;k <= s;k++)
				{
					if (l % k == 0)
					{
						break;
					}
				}
				if (k > s)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(l);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

