package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 10000;
		int b;
		int c;
		int k;
		int[] a = new int[m];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			if (c > b)
			{
				for (k = 0;k < m;k++)
				{
					if (k >= b + 1 && k <= c)
					{
						a[k] = 1;
					}
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (a[i] == 1)
			{
				b = i - 1;
				break;
			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			if (a[i] == 1)
			{
				c = i;
				break;
			}
		}
		for (i = b + 1;i <= c + 1;i++)
		{
			if (a[i] != 1)
			{
				break;
			}
		}
		if (i == c + 1)
		{
			System.out.printf("%d %d",b,c);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

