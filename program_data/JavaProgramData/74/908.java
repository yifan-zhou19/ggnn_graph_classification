package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int k;
		int x;
		int[] a = new int[5];
		int p;
		int num;
		int[] b = new int[100];
		int c = 1;
		int d = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("" "");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			k = Math.sqrt(i);
			for (x = 2;x <= k;x++)
			{
				if (i % x == 0)
				{
					break;
				}
			}
			if (x >= k + 1)
			{
			a[4] = i / 10000;
			a[3] = (i - a[4] * 10000) / 1000;
			a[2] = (i - a[4] * 10000 - a[3] * 1000) / 100;
			a[1] = (i - a[4] * 10000 - a[3] * 1000 - a[2] * 100) / 10;
			a[0] = i - a[4] * 10000 - a[3] * 1000 - a[2] * 100 - a[1] * 10;

			if (a[4] > 0)
			{
				num = a[0] * 10000 + a[1] * 1000 + a[2] * 100 + a[3] * 10 + a[4];
			}
			else if (a[3] > 0)
			{
				num = a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3];
			}
			else if (a[2] > 0)
			{
				num = a[0] * 100 + a[1] * 10 + a[2];
			}
			else if (a[1] > 0)
			{
				num = a[0] * 10 + a[1];
			}
			else
			{
				num = a[0];
			}


			if (num == i)
			{
				b[c] = i;
				c = c + 1;
			}
			}
		}
		if (c > 1)
		{
			for (d = 1;d <= c - 2;d++)
			{
			System.out.printf("%d,",b[d]);
			}
		System.out.printf("%d\n",b[d]);
		}
		if (c == 1)
		{
			System.out.print("no\n");
		}
	}

}

