package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int c;
		int i = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		a[0] = c;
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			a[i] = c;
			for (j = 0;j <= i - 1;j++)
			{
				if (c == a[j])
				{
					a[i] = 0;
				}
			}
				if (a[i] != 0)
				{
					System.out.printf(" %d",a[i]);
				}
		}
		return 0;
	}
}

