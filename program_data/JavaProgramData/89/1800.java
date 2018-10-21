package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int N = 10000;
		int[] a = new int[N];
		int[] b = new int[N];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int x;
		int y;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		while (x != 0 || y != 0)
		{
			a[x] = 1;
			b[y]++;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				continue;
			}
			if (b[i] == n - 1)
			{
				System.out.printf("%d",i);
				System.exit(0);
			}
		}
		System.out.print("NOT FOUND");
		return 0;
	}

}

