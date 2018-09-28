package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int b;
		int c;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[25000];
		for (i = 0;i <= (n - 6) / 2;i++)
		{
			a[i] = 6 + i * 2;
		}
		int sushu = int x;
		for (i = 0;i <= (n - 6) / 2;i++)
		{
			for (j = 2;j <= a[i] / 2;j = j + 1)
			{
				b = j;
				r = sushu(b);
				if (r != 0)
				{
					c = a[i] - b;
					if (sushu(c) != 0)
					{
						System.out.printf("%d=%d+%d\n",a[i],b,c);
						break;
					}
				}
			}
		}
		return 0;
	}
	public static int sushu(int x)
	{
		int l;
		int m = 1;
		if (x != 2)
		{
			for (l = 2;l <= Math.sqrt(x);l++)
			{
				if (x % l == 0)
				{
					m = 0;
					break;
				}
			}
		}
		return (m);
	}

}

