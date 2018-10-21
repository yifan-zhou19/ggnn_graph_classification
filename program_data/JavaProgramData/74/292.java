package <missing>;

public class GlobalMembers
{
	public static int sushu(int i)
	{
		int k;
		int flag1 = 0;
		for (k = 2;k <= i;k++)
		{
			if (i % k == 0)
			{
				break;
			}
			else
			{
				if (k < i - 1)
				{
					continue;
				}
				else if (k >= i - 1)
				{
					flag1 = 1;
				}
			}
		}
		return (flag1);
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int l;
		int p;
		int o;
		int[] a = new int[10000];
		int h = 0;
		int k;
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
		for (i = m;i <= n;i++)
		{
			l = sushu(i);
			if (l == 1)
			{
				o = 0;
				p = i;
				while (p > 0)
				{
					o = o * 10 + p % 10;
					p /= 10;
				}
				if (i == o)
				{
					a[h] = i;
					h++;
				}
			}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
		else if (h == 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
			for (k = 0;k < h - 1;k++)
			{
				System.out.printf("%d,",a[k]);
			}
			System.out.printf("%d",a[h - 1]);
		}
	}

}

