package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		n = 3;

		while (n <= (m / 2))
		{
			b = 2;
			c = 2;
			while (c < n)
			{
				if ((n % c) == 0)
				{
					break;
				}
				else
				{
					c++;
				}
			}
			if (c == n)
			{
				a = m - n;
			}
			else
			{
				n = n + 2;
				continue;
			}
			while (b < a)
			{
				if ((a % b) == 0)
				{
					break;
				}
				else
				{
					b++;
				}
			}
			if (b == a)
			{
				System.out.printf("%d %d\n",n,a);
			}
			n = n + 2;
		}
		return 0;
	}

}

