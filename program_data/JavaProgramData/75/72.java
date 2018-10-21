package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[1001];
		int[] y = new int[1001];
		int i = 1;
		int j;
		int k;
		int t = 0;
		int p = 1;
		int l;
		int[] a = new int[10000];
		int m;
		char c;
		for (i = 1; ; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
			if (c == '\n')
			{
				break;
			}
		}
		for (i = 1; ; i++)
		{
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(c);
			if (c == '\n')
			{
				break;
			}
		}
		System.out.print(i);
		System.out.print(" ");
		for (j = 1; j <= i; j++)
		{
			for (k = x[j]; k < y[j]; k++)
			{
				for (l = 1; l <= i; l++)
				{
					if (x[l] <= k != 0 && y[l] > k)
					{
						t++;
					}
				}
				a[p] = t;
				p++;
				t = 0;
			}
		}
		p--;
		m = a[1];
		for (j = 2; j <= p; j++)
		{
			if (m < a[j])
			{
				m = a[j];
			}
		}
		System.out.print(m);
		return 0;
	}


}

