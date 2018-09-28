package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String p;
		p = a;
		int i = 0;
		int j;
		int k;
		int n;
		int sum = 0;
		int[] s = new int[501];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();

		while (true)
		{
			*(p.Substring(i)) = System.in.read();
			if (*(p.Substring(i)) == '\n')
			{
				break;
			}
			i++;
		}
		System.out.print("\n");
		sum = i;
		char[][] f = new char[501][5];
		String q = new String(new char[5]);
		q = f;
		int[] g = new int[501];
		for (i = 0 ; i <= sum - n ; i++)
		{
			for (j = i,k = 0 ; j <= n - 1 + i,k <= n - 1 ; j++,k++)
			{
				*(*(q.Substring(i)) + k) = *(p.Substring(j));
			}
		}
		int[] flag = new int[501];
		k = 0;
		int t;

		for (i = 0 ; i <= sum - n ; i++)
		{
			if (flag[i] == 1)
			{
				k--;
				continue;
			}
			for (j = i ; j <= sum - n ; j++)
			{
							for (t = 0 ; t <= n - 1 ; t++)
							{
				   if (*(*(q.Substring(i)) + t) != *(*(q.Substring(j)) + t))
				   {
					   break;
				   }
							}
				if (t == n)
				{
				g[i]++;
				flag[j] = 1;
				}

			}
			k++;
		}
		int l = 0;
		for (i = 0 ; i <= sum - n ; i++)
		{
			l = Math.max(g[i],l);
		}
		if (l >= 2)
		{
			System.out.print(l);
			System.out.print("\n");
			for (i = 0 ; i <= sum - n ; i++)
			{
				if (g[i] == l)
				{
					for (t = 0 ; t <= n - 1 ; t++)
					{
						System.out.print((*(q.Substring(i)) + t));
					}
					System.out.print("\n");
				}
			}
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}
}

