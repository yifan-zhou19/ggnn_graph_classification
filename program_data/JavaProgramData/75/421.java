package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int j;
		int k;
		int[] s = new int[10000];
		int q;
		int maxr;
		int p;
		int mint;
		int maxt;
		int x;
		int y;
		char c;
		for (i = 0;;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((c = System.in.read()) == '\n')
			{
			break;
			}
		}
		for (j = 0;;j++)
		{
			b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((c = System.in.read()) == '\n')
			{
				break;
			}
		}
		mint = a[0];
		for (x = 1;x <= i;x++)
		{
			if (a[x] < mint)
			{
				mint = a[x];
			}
		}
		maxt = b[0];
		for (y = 1;y <= i;y++)
		{
			if (b[y] > maxt)
			{
				maxt = b[y];
			}
		}
		for (k = mint;k <= maxt - 1;k++)
		{
			for (p = 0;p <= i;p++)
			{
				if (k >= a[p] != 0 && k < b[p])
				{
					s[k] = s[k] + 1;
				}
			}
		}
		maxr = s[mint];
		for (q = mint + 1;q <= maxt - 1;q++)
		{
			if (maxr < s[q])
			{
				maxr = s[q];
			}
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(maxr);
		System.out.print("\n");
		return 0;
	}
}

