package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int e;
		int q = 0;
		int result;
		int n;
		int[] a = new int[500];
		int[] b = new int[500];
		int[] sz = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
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
		for (i = 0;i < n;i++)
		{
		for (k = a[i];k < b[i];k++)
		{
			sz[k] = 1;
		}
		}
		for (i = 0;i <= n;i++)
		{
			for (k = 0;k < n - 1;k++)
			{
				if (a[k] > a[k + 1])
				{
					e = a[k];
					a[k] = a[k + 1];
					a[k + 1] = e;
				}
			}
		}
		 for (i = 0;i <= n;i++)
		 {
			for (k = 0;k < n - 1;k++)
			{
				if (b[k] < b[k + 1])
				{
					e = b[k];
					b[k] = b[k + 1];
					b[k + 1] = e;
				}
			}
		 }

		result = b[0] - a[0];
		for (i = a[0];i <= b[0];i++)
		{
			q += sz[i];
		}
		if (result == q)
		{
			System.out.printf("%d %d",a[0],b[0]);
		}
		else if (result != q)
		{
			System.out.print("no");
		}
			return 0;
	}




}

