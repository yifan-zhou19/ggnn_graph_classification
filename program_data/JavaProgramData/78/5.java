package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		if (z + q == s + l && z + l > s + q && q > z + s)
		{
			int[] a = {z, q, s, l};
			int i;
			int j;
			int t;
			for (i = 0;i < 3;i++)
			{
			for (j = 0;j < 3 - i;j++)
			{
			if (a[j] < a[j + 1])
			{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
			}
			}
			}
			for (i = 0;i < 4;i++)
			{
				if (a[i] == z)
				{
					System.out.printf("z %d\n",z);
				}
				if (a[i] == q)
				{
					System.out.printf("q %d\n",q);
				}
				if (a[i] == s)
				{
					System.out.printf("s %d\n",s);
				}
				if (a[i] == l)
				{
					System.out.printf("l %d\n",l);
				}
			}
		}
		}
		}
		}
		}
	}
}
