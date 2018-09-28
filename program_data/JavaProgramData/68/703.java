package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k1;
		int k2;
		int r1;
		int r2;
		int m;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{
			for (m = 3; m <= i / 2; m = m + 2)
			{
				k1 = (int) Math.sqrt((double)m);
				for (r1 = 2; r1 <= k1; r1++)
				{
					if (m % r1 == 0)
					{
						break;
					}
				}
				if (r1 == k1 + 1)
				{
					a = m;
					b = i - m;
					k2 = (int) Math.sqrt((double)b);
					for (r2 = 2; r2 <= k2; r2++)
					{
						if (b % r2 == 0)
						{
							break;
						}
					}
					if (r2 == k2 + 1)
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(a);
						System.out.print("+");
						System.out.print(b);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}


}

