package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		while (true)
		{
			int n;
			int m;
			int[] a = new int[310];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			int i = 0;
			int j = -1;
			while (true)
			{
				i = i + 1;
				j = j + 1;
				if (j == n)
				{
					j = j - n;
				}
				if (a[j] == 1)
				{
					i = i - 1;
					continue;
				}
				if (i == m)
				{
					a[j] = 1;
					i = i - m;
				}
				int s = 0;
				int win = 0;
				int q = 0;
				for (q = 0;q < n;q++)
				{
					if (a[q] == 0)
					{
						s += 1;
						win = q;
					}
					if (s > 1)
					{
						break;
					}
				}
				if (q == n)
				{
					System.out.printf("%d\n",win + 1);
					break;
				}
			}
		}
	}
}

