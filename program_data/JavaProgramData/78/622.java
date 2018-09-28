package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;++z)
		{
			for (q = 1;q <= 5;++q)
			{
				for (s = 1;s <= 5;++s)
				{
					for (l = 1;l <= 5;++l)
					{
						if ((s + l == z + q) + (z + l > s + q) + (z + s < q) == 3)
						{
		   int[] a = {10000 * z + 'z', 10000 * q + 'q', 10000 * s + 's', 10000 * l + 'l'};
		int i;
		int j;
		int t;
		for (j = 0;j <= 3;j++)
		{
			for (i = 0;i <= 3 - j;i++)
			{
				if (a[i] < a[i + 1])
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		 int[] b = {a[0] / 1000, a[1] / 1000, a[2] / 1000, a[3] / 1000};
			System.out.print((char)(a[0] % 10000));
			System.out.print(" ");
			System.out.print(b[0]);
			System.out.print('\n');
			System.out.print((char)(a[1] % 10000));
			System.out.print(" ");
			System.out.print(b[1]);
			System.out.print('\n');
			System.out.print((char)(a[2] % 10000));
			System.out.print(" ");
			System.out.print(b[2]);
			System.out.print('\n');
			System.out.print((char)(a[3] % 10000));
			System.out.print(" ");
			System.out.print(b[3]);
			System.out.print('\n');
		break;
						}
					}
				}
			}
		}

		return 0;

	}

}
