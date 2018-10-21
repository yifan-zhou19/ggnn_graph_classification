package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int u;
		int k;
		int e;
		int p;
		int[] a = new int[60000];
		int[] b = new int[60000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = 0;
		for (i = 0,u = 0;i < n;i++,u++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[u]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k < n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i];
					a[i] = a[i + 1];
					a[i + 1] = e;
				}
			}
		}
		for (k = 1;k < n;k++)
		{
			for (u = 0;u < n - k;u++)
			{
				if (b[u] > b[u + 1])
				{
					e = b[u];
					b[u] = b[u + 1];
					b[u + 1] = e;
				}
			}
		}
		for (i = 1,u = 0;i < n;i++,u++)
		{
			if (b[u] < a[i])
			{
				System.out.print("no");
				break;
			}
			else
			{
				p = p + 1;
			}
			 if (p == n - 1)
			 {
			 System.out.printf("%d %d",a[0],b[n - 1]);

			 }
		}
		return 0;
	}


}

