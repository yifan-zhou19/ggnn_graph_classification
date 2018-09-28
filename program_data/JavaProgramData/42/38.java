package <missing>;

public class GlobalMembers
{
	//10?28????????????????????1000012899?
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[100001];
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = n;
	   i = 1;
		while (i <= m)
		{
			while (a[i] == k)
			{
				 for (j = i; j <= m; j++)
				 {
					 a[j] = a[j + 1];
				 }
				 m = m - 1;
			}
			i++;
		}
		System.out.print(a[1]);
		for (i = 2; i <= m; i++)
		{
			System.out.print(' ');
			System.out.print(a[i]);
		}
		return 0;
	}


}

