package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int q = 0;
		int m;
		int n;
		int i;
		int k = 0;
		int l;
		int s = 0;
		int d;
		int t;
		int p = 1;
		int h;
		int j;
		int[] a = new int[100];

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
		for (i = 0;i <= n - m;i++)
		{
			t = m + i;
			l = t;

			for (h = 0;;h++)
			{
				d = l % 10;
				l = l / 10;
				s = 10 * s + d;
				if (l == 0)
				{
					break;
				}
			}
			if (s != t)
			{
				p = 0;
			}
			s = 0;
			for (j = 2; j <= t / 2; j++)
			{
				if (t % j == 0)
				{
					p = 0;
				}
			}
			if (p == 1)
			{
				a[q] = t;
				q++;
			}
			p = 1;
		}
		if (q > 0)
		{
			for (i = 0;i < q - 1;i++)
			{
			System.out.printf("%d,",a[i]);
			}
		System.out.printf("%d",a[q - 1]);
		}
		else
		{
			System.out.print("no");
		}
	}


}

