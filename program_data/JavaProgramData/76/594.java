package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int e;
		int f;
		int[] a = new int[max];
		int[] b = new int[max];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
				}
				if (b[i] > b[i + 1])
				{
					f = b[i];
					b[i] = b[i + 1];
					b[i + 1] = f;
				}
			}
		}
		int h;
		h = 1;
		for (i = 1;i < n;i++)
		{
			if (b[i] < a[i + 1])
			{
				h = 0;
			}
		}
		if (h == 1)
		{
					System.out.printf("%d %d",a[1],b[n]);
		}
		else
		{
				System.out.print("no");
		}
		return 0;
	}



}

