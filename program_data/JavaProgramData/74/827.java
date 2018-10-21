package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		int j;
		int t;
		int r;
		int[] a = new int[20];
		int[] b = new int[100];
		int l;
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
		l = 1;
		for (i = m;i <= n;i++)
		{
			for (k = 2;k <= i;k++)
			{
				if (i % k == 0)
				{
					break;
				}
			}
			if (k == i)
			{
				for (k = 1;k <= 10;k++)
				{
					a[k] = (int)(i / Math.pow(10,k - 1)) - (int)(i / Math.pow(10,k)) * 10;
					if ((int)(i / Math.pow(10,k)) == 0)
					{
						break;
					}
				}
				j = 1;
				t = 1;
				for (r = k;r >= k / 2 + 1;r--)
				{
					if (a[r] == a[j])
					{
						t = t * 1;
					}
					if (a[r] - a[j] != 0)
					{
						t = 0;
					}
					j = j + 1;
				}
				if (t == 1)
				{
						  b[l] = i;
						  l = l + 1;
				}
			}

		}

		if (l == 1)
		{
			System.out.print("no");
		}
		else
		{
		System.out.printf("%d",b[1]);
		for (i = 2;i < l;i++)
		{
		System.out.printf(",%d",b[i]);
		}
		}
		return 0;
	}
}

