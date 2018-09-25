package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int n0;
		int p1;
		int m0;
		int[] a = new int[301];
		while (scanf("%d%d", n, m), n != 0)
		{
			for (i = 0;i < n;i++)
			{
				a[i] = i + 1;
			}
			n0 = n;
			p1 = 0;
			while (n0 > 1)
			{
				m0 = m;
				while (m0 != 1)
				{
					if (a[(p1 + 1) % n] != 0)
					{
						m0--;
					}
					p1 = (p1 + 1) % n;

				}
				a[p1] = 0;
				while (a[p1 % n] == 0)
				{
					p1 = (p1 + 1) % n;
				}
				n0--;

			}

			System.out.printf("%d\n",a[p1]);

		}

		return 0;
	}
}
