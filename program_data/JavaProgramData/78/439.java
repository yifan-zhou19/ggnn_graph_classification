package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 10;z <= 50;z += 10)
		{
		for (q = 10;q <= 50;q += 10)
		{
		for (s = 10;s <= 50;s += 10)
		{
		for (l = 10;l <= 50;l += 10)
		{
			if (z != q && z != s && z != l && q != s && q != l && s != l && z + q == s + l && z + l > s + q && z + s < q)
			{
				 int[] a = {z, q, s, l};
				 int i;
				 int j;
				 int m;
				 char[] b = {'z', 'q', 's', 'l'};
				 char n;
				for (i = 0;i < 3;i++)
				{
				for (j = 0;j < 3 - i;j++)
				{
					if (a[j] < a[j + 1])
					{
						m = a[j];
						n = b[j];
						a[j] = a[j + 1];
						b[j] = b[j + 1];
						a[j + 1] = m;
						b[j + 1] = n;
					}
				}
				}
				for (i = 0;i < 4;i++)
				{
					System.out.printf("%c %d\n",b[i],a[i]);
				}
			}
		}
		}
		}
		}
		return 0;
	}
}
