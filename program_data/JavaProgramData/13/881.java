package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] t = new int[10000];
		int s;
		int b;
		int c;
		int k = 0;
		int i = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("\n");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (b = 0,c = 0;b <= i - 1;b++)
			{
				if (a[i] == a[b])
				{
					c = c + 1;
				}
			}
			if (c == 0)
			{
				t[k] = a[i];
			k++;
			}
		}
		if (k == 0)
		{
			System.out.printf("%d",a[0]);
		}
		if (k > 0)
		{
		System.out.printf("%d ",a[0]);
		for (s = 0;s <= k - 2;s++)
		{
		System.out.printf("%d ",t[s]);
		}
		System.out.printf("%d",t[k - 1]);
		}
	return 0;
	}
}

