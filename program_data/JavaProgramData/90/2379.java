package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????(15-11) ?????   **
	//*?????? 1300012934 **
	//*???2013.11.28  **
	//********************************
	public static int k;
	public static int l;
	public static int n;
	public static void put(int p, int q)
	{
		int j;
		for (j = p; j <= q; j++)
		{
			l = l - j;
			n--;
			if (n < 0)
			{
				l += j;
				n++;
				break;
			}
			else
			{
				if (l < 0)
				{
					l += j;
					n++;
					break;
				}
				if (l == 0)
				{
					k++;
					l += j;
					n++;
					break;
				}
				if (l > 0)
				{
					put(j, l);
					l += j;
					n++;
				}
			}
		}

	}
	public static int Main()
	{
		int t;
		int m;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= t; i++)
		{
			k = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l = m;
			put(1, m);
			System.out.print(k);
			System.out.print("\n");
		}

		return 0;
	}

}

