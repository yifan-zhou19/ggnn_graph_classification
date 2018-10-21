package <missing>;

public class GlobalMembers
{
	//???2010?10?29?
	//???1000010586_???
	//???????????

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k1;
		int k2;
		int t;
		int a;
		int b;
		int m;
		int l;
		int g;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6 ; i <= n ; i = i + 2)
		{
			for (j = 2 ; j <= i - 2 ; j++)
			{
				m = 0;
				k1 = Math.sqrt(j);
				for (t = 2 ; t <= k1 ; t++)
				{
					if (j % t == 0)
					{
						m = 1;
					}
				}
				if (m == 0)
				{
					g = 0;
					k2 = Math.sqrt(i - j);
					for (l = 2 ; l <= k2 ; l++)
					{
						if ((i - j) % l == 0)
						{
							g = 1;
						}
					}
					if (g == 0)
					{
						System.out.print(i);
						System.out.print("=");
						System.out.print(j);
						System.out.print("+");
						System.out.print(i - j);
						System.out.print("\n");
						break;
					}
				}
			}
		}
		return 0;
	}
}

