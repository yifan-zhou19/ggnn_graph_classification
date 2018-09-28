package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = n;
		int a = n - 1; //?n???????????
		int c = 1;
		while (i > 0)
		{ //?n?n-1?????
			if (a % (n - 1) == 0)
			{
				m = (a / (n - 1)) * n + k;
				a = m;
				i--;
			}
			else
			{
				c++;
				m = 0;
				a = c * (n - 1);
				i = n;
			}
		}
	System.out.print(m);
	System.out.print("\n");
	return 0;
	}
}

