package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int t;
		int s;
		int p;
		int q;
		int i;
		int j;
		int k = 0;
		int r;
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
		for (i = (m % 2 == 0?m + 1:m);i <= n;i += 2)
		{
			t = i;
			s = 0;
			for (j = 0;t != 0;j++)
			{
				p = t % 10;
				t = t / 10;
				s = s * 10 + p;
			}
			if (s == i)
			{
				r = 1;
				q = Math.sqrt(i);
				for (j = 2;j <= q;j++)
				{
					if (i % j == 0)
					{
					r = 0;
					break;
					}
				}
				if (r == 1)
				{
					a[k] = i;
					k++;
				}
			}
		}
		if (k != 0)
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d\n",a[k - 1]);
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}

	}
}

