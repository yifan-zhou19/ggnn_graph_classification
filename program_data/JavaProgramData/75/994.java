package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1001];
		int n;
		int i;
		int j;
		int k;
		int[] vis = new int[1001];
		char c;
		n = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[n] = Integer.parseInt(tempVar);
		}
		while (scanf("%c", c), c == ',')
		{
			n++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[n] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= 1000;i++)
		{
			vis[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			for (j = a[i];j < k;j++)
			{
				vis[j]++;
			}
		}
		k = 0;
		for (i = 0;i <= 1000;i++)
		{
			 if (vis[k] < vis[i])
			 {
				 k = i;
			 }
		}
		System.out.print(n);
		System.out.print(' ');
		System.out.print(vis[k]);
		System.out.print("\n");
		return 0;
	}
}

