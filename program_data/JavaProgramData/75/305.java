package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int n = 0;
		int m = 0;
		int[] a = new int[10000];
		int[][] d = new int[1000][2];
		int[] c = {1, 10, 100, 1000, 10000};
		char b;
		char[] e = {0, '\0', '\0', '\0', '\0', '\0'};
		for (;;)
		{
			b = System.in.read();
			i = 0;
			m = 0;
			for (;;i++)
			{
				if (b == ',' || b == '\n')
				{
					break;
				}
				e[i] = b;
				b = System.in.read();
			}
			for (k = i - 1;k >= 0;k--)
			{
				m = m + (e[k] - '0') * c[i - 1 - k];
			}
			n++;
			d[j++][0] = m;
			if (b == '\n')
			{
				break;
			}
		}
		j = 0;
		for (;;)
		{
			b = System.in.read();
			i = 0;
			m = 0;
				for (;;i++)
				{
				if (b == ',' || b == '\n')
				{
					break;
				}
				e[i] = b;
				b = System.in.read();
				}
			for (k = i - 1;k >= 0;k--)
			{
				m = m + (e[k] - '0') * c[i - 1 - k];
			}
			d[j++][1] = m;
			if (b == '\n')
			{
				break;
			}
		}
		System.out.printf("%d ",n);
		for (i = 0;i < n;i++)
		{
			for (j = d[i][0];j < d[i][1];j++)
			{
				a[j]++;
			}
		}
		m = 0;
		for (i = 0;i < 10000;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}
		System.out.printf("%d",m);
	}
}
