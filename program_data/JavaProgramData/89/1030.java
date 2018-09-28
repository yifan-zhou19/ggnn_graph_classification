package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		int x;
		int y;
		int k = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
			a[x]++;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == (n - 1))
			{
				k++;
				System.out.printf("%d\n",i);
			}
		}
		if (k == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

