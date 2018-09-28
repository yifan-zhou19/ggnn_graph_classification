package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int e;
		int i;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
					e = b[i];
					b[i] = b[i + 1];
					b[i + 1] = e;
				}
				else if (a[i] == a[i + 1])
				{
					if (b[i] > b[i + 1])
					{
						e = b[i];
						b[i] = b[i + 1];
						b[i + 1] = e;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i + 1] <= b[i])
			{
				a[i + 1] = a[i];
				if (b[i + 1] <= b[i])
				{
					b[i + 1] = b[i];
				}
				c = c + 1;
			}
			else
			{
				if (c > 0)
				{
					System.out.printf("%d %d",a[i],b[i]);
				}
				else if (c == 0)
				{
					System.out.print("no");
				}
				break;
			}
		}
		return 0;
	}

}

