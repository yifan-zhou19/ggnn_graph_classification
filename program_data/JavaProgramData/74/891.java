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
		int[] a = new int[7];
		int p;
		int num;
		int[] b = new int[50];
		int c = 1;
		int d;
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
			   a[6] = i / 100000;
			   a[5] = (i - a[6] * 100000) / 10000;
			   a[4] = (i - a[6] * 100000 - a[5] * 10000) / 1000;
			   a[3] = (i - a[6] * 100000 - a[5] * 10000 - a[4] * 1000) / 100;
			   a[2] = (i - a[6] * 100000 - a[5] * 10000 - a[4] * 1000 - a[3] * 100) / 10;
			   a[1] = i - a[6] * 100000 - a[5] * 10000 - a[4] * 1000 - a[3] * 100 - a[2] * 10;
			   if (a[6] > 0)
			   {
				   num = a[1] * 100000 + a[2] * 10000 + a[3] * 1000 + a[4] * 100 + a[5] * 10 + a[6];
			   }
			   else if (a[5] > 0)
			   {
				   num = a[1] * 10000 + a[2] * 1000 + a[3] * 100 + a[4] * 10 + a[5];
			   }
			   else if (a[4] > 0)
			   {
				   num = a[1] * 1000 + a[2] * 100 + a[3] * 10 + a[4];
			   }
			   else if (a[3] > 0)
			   {
				   num = a[1] * 100 + a[2] * 10 + a[3];
			   }
			   else if (a[2] > 0)
			   {
				   num = a[1] * 10 + a[2];
			   }
			   else
			   {
				   num = a[1];
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
		if ((c = 1) != 0)
		{
			System.out.print("no\n");
		}
	}
}

