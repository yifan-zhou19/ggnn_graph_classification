package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int x;
		int p = 0;
		int[] a = new int[100001];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x = Integer.parseInt(tempVar3);
			}
			a[x]++;
		}
		for (i = 0;i <= 100000;i++)
		{
			for (j = 1;j <= a[i];j++)
			{
				if (p == 0)
				{
				System.out.printf("%d",i);
				p = 1;
				}
				else
				{
					System.out.printf(" %d",i);
				}
			}
			a[i] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			a[x] = 1;
		}
		for (i = 0;i <= 100000;i++)
		{
			for (j = 1;j <= a[i];j++)
			{
				System.out.printf(" %d",i);
			}
			a[i] = 0;
		}
		return 0;
	}
}

