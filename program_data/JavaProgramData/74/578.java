package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int r;
		int k;
		int s = 0;
		int t;
		int w = 0;
		int[] a = new int[500];
		int[] b = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			j = i;
			k = 0;
			while (j > 0)
			{
				r = j % 10;
				j = j / 10;
				k = 10 * k + r;
			}
			if (k == i)
			{
				a[s] = i;
				s++;
			}
		}
		for (i = 0;i < s;i++)
		{
			t = 0;
			for (j = 2;j <= Math.sqrt(a[i]);j++)
			{
				if (a[i] % j == 0)
				{
					t++;
				}
			}
			if (t == 0)
			{
				b[w] = a[i];
				w++;
			}
		}

		if (w == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < w - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
		System.out.printf("%d\n",b[w - 1]);
		}

	}
}

