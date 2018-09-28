package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int n;
		int a;
		int b;
		int i;
		int m;
		int t;
		int k;
		p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (n = 6;n <= p;n = n + 2)
		{
			for (i = 2;i <= (n / 2);i = i + 1)
			{
				a = Math.sqrt(i);
				for (t = 3;t <= a;t = t + 2)
				{
					if (i % t == 0)
					{
						break;
					}
				}
				if (t > a)
				{
					m = n - i;
					b = Math.sqrt(m);
					for (k = 2;k <= b;k++)
					{
						if (m % k == 0)
						{
							break;
						}
					}
					if (k == b + 1)
					{
						System.out.print(n);
						System.out.print("=");
						System.out.print(i);
						System.out.print("+");
						System.out.print(m);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}

}

