package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[25000];
		int m = 4;
		int j;
		int q;
		double k;
		a[2] = 3;
		a[3] = 5;
		a[4] = 7;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 11; i <= n / 2; i = i + 2)
		{
			k = Math.sqrt(1.0 * i);
			for (j = 2; (a[j] <= k != 0 && j <= m); j++)
			{
				if (i % a[j] == 0)
				{
					break;
				}
			}
			if (a[j] > k || j > m)
			{
				m++;
				a[m] = i;
			}
		}
		for (int i = 6; i <= n; i = i + 2)
		{
			for (int p = 2; a[p] <= i / 2; p++)
			{
				k = Math.sqrt(1.0 * (i - a[p]));
				for (q = 3; q <= k; q = q + 2)
				{
					if ((i - a[p]) % q == 0)
					{
						break;
					}
				}
				if (q > k)
				{
					System.out.print(i);
					System.out.print('=');
					System.out.print(a[p]);
					System.out.print('+');
					System.out.print(i - a[p]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

