package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[3];
		int i;
		int j;
		int k;
		int r1;
		int r2;
		int r3;
		int l;
		int q;
		int w;
		int e;
		for (q = 1;q < 3;q++)
		{
			;
		}
		{
			for (w = 1;w < 3;w++)
			{
				for (e = 1;e < 3;e++)
				{
					a[0] = q;
					a[1] = w;
					a[2] = e;
					i = ((a[1] > a[0]) + (a[2] == a[0]));
					j = ((a[0] > a[1]) + (a[0] > a[2]));
					k = ((a[2] > a[1]) + (a[1] > a[0]));
					r1 = ((i <= j != 0 && a[0] >= a[1]) || (i >= j != 0 && a[0] <= a[1]));
					r2 = ((i <= k != 0 && a[0] >= a[2]) || (i >= k != 0 && a[0] <= a[2]));
					r3 = ((j <= k != 0 && a[1] >= a[2]) || (j >= k != 0 && a[1] <= a[2]));
					if (r1 + r2 + r3 == 3)
					{
											for (l = 1;l <= 3;l++)
											{
							if (a[0] == l)
							{
								System.out.print("A");
							}
							if (a[1] == l)
							{
								System.out.print("B");
							}
							if (a[2] == l)
							{
								System.out.print("C");
							}
											}
						return 0;
					}
				}
			}
	}
		return 0;
	}
}
