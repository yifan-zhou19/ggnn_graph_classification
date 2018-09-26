package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		int q;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 6; k <= n; k += 2)
		{
			a = k / 2;
			for (p = 3; p <= a; p += 2) //??p?????
			{
				b = (int) Math.sqrt((double) p);
				for (i = 2; i <= b; i++)
				{
					if (p % i == 0)
					{
						break;
					}
				}
				if (i == b + 1)
				{ //??q?????
					q = k - p;
					c = (int) Math.sqrt((double) q);
					for (j = 2; j <= c; j++)
					{
						if (q % j == 0)
						{
							break;
						}
					}
					if (j == c + 1)
					{
						System.out.print(k);
						System.out.print("=");
						System.out.print(p);
						System.out.print("+");
						System.out.print(q);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

