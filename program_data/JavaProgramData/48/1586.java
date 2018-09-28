package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] bac =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i = 1;
		bac[4][4] = m;
		int p = 0;
		int q = 0;
		while (i <= n)
		{
			q = 0;
			int[][] a =
			{
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 0, 0}
			};
			while (q < 9)
			{
				p = 0;
				while (p < 9)
				{
					if (bac[p][q] != 0)
					{
						a[p][q] = a[p][q] + 2 * bac[p][q];
						a[p - 1][q] += bac[p][q];
						a[p + 1][q] += bac[p][q];
						a[p][q - 1] += bac[p][q];
						a[p][q + 1] += bac[p][q];
						a[p - 1][q - 1] += bac[p][q];
						a[p - 1][q + 1] += bac[p][q];
						a[p + 1][q - 1] += bac[p][q];
						a[p + 1][q + 1] += bac[p][q];
					}
					p++;
				}
				q++;
			}
			p = 0;
			q = 0;
			while (q < 9)
			{
				p = 0;
				while (p < 9)
				{
					bac[p][q] = a[p][q];
					p++;
				}
				q++;
			}
			i++;
		}
		p = 0;
		q = 0;
		while (q < 9)
		{
			p = 0;
			while (p < 8)
			{
				System.out.printf("%d ",bac[p][q]);
				p++;
			}
			System.out.printf("%d\n",bac[p][q]);
			q++;
		}
		return 0;
	}
}

