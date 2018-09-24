package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char q;
		String ch = new String(new char[300]);
		int r;
		int n;
		int i;
		int j;
		int t;
		int w;
		int e;
		int m = 0;
		int[] k = new int[300];
		ch = new Scanner(System.in).nextLine();
		r = ch.length();
		for (n = 65;n <= 90;n++)
		{
			q = n;
			for (i = 0;i <= r - 1;i++)
			{
				if (ch.charAt(i) == n)
				{
						k[n]++;
				m++;
				}
			}

			if (k[n] > 0)
			{
				System.out.printf("%c=%d\n",q,k[n]);
			}
		}
		for (t = 97;t <= 122;t++)
		{
			q = t;
			for (w = 0;w <= r - 1;w++)
			{
				if (ch.charAt(w) == t)
				{
						k[t]++;
				m++;
				}
			}

			if (k[t] > 0)
			{
				System.out.printf("%c=%d\n",q,k[t]);
			}
		}
		if (m == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}
