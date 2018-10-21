package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*10.19??  ????????                          *
	//*?????  ?? 1100012844                          *
	//*???2011?10?23?                                 *
	//*******************************************************
	public static int Main()
	{
		int[] a = new int[100001];
		int i;
		int j;
		int k;
		int n;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = n;
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1, i = 1; i <= n; i++, j++)
		{
			if (a[j] == k)
			{
				for (p = j; p <= n; p++)
				{
					a[p] = a[p + 1];
				}
				j--;
				q--;
			}
		}
		for (i = 1; i <= q; i++)
		{
			if (i != q)
			{
				System.out.print(a[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

