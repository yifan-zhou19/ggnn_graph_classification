package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int x;
		int i;
		int p;
		int q;
		int[] a = new int[100];
		int y;
		int[] b = new int[100];
		int z = 0;
		int j;
		double k;
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
		for (x = m;x <= n;x++)
		{
			k = Math.sqrt(x);
			for (i = 2;i < k;i++)
			{
				if (x % i == 0)
				{
					break;
				}
			}
			if (i > k)
			{
				p = 1;
			}
			y = x;
			j = 0;
			while (y >= 1)
			{
				y = (double)y / 10;
				j++;
			}
			y = x;
			for (i = 0;i < j;i++)
			{
				k = Math.pow(10,j - i - 1);
				a[i] = y / k;
				y = y - a[i] * k;
			}
			for (i = 0;i < j;i++)
			{
				if (a[i] != a[j - i - 1])
				{
					break;
				}
			}
			if (i == j)
			{
				q = 1;
			}
			if (q == 1 && p == 1)
			{
				b[z] = x;
				z++;

			}
			p = 0;
			q = 0;
		}
		if (b[0] != 0)
		{
			for (i = 0;i < z - 1;i++)
			{
				System.out.printf("%d,",b[i]);
			}
			System.out.printf("%d\n",b[z - 1]);
		}
		else
		{
			System.out.print("no\n");
		}
	}

}

