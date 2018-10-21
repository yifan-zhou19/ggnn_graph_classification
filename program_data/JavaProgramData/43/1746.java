package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int i;
		int k;
		int j;
		int t;
		int x;
		int b;
		int c;
		int d;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}

		for (i = 3,j = 0;i < 10000;i++)
		{
			for (e = 0,k = 2;k < i;k++)
			{
				t = i / k;
				if (t * k == i)
				{
					e = 1;
					break;
				}
			}
			if (e == 0)
			{
				a[j] = i;
				j++;
			}
		}
		for (b = 0;b <= 10000;b++)
		{
			c = x - a[b];
			if (c < x / 2)
			{
				break;
			}
				for (d = 0;d < 10000;d++)
				{
					if (c == a[d])
					{
						System.out.printf("%d %d\n",a[b],a[d]);
						break;
					}
				}
		}
		return 0;
	}

}

