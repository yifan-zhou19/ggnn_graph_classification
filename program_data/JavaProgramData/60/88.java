package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int k;
		int i;
		int j;
		int r;
		int c;
		int q = 0;
		int p = 0;
		int[] a = new int[2000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= n;i = i + 2)
		{
			c = 1;
			for (j = 2;j <= i / 2;j++)
			{
				r = i % j;
				if (r == 0)
				{
					c = 0;
					break;
				}
			}
			if (c == 1)
			{
				a[p] = i;
				p++;
			}
		}
		for (i = 0;a[i] != 0;i++)
		{
			if (a[i + 1] - a[i] == 2)
			{
				System.out.printf("%d %d\n",a[i],a[i + 1]);
				q++;
			}

		}
		if (q == 0)
		{
			System.out.print("empty");
		}

	}
}

