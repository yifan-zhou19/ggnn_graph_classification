package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int p = 0;
		int r;
		int x;
		int y;
		int[] b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
		b[i] = 0;
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if ((x == 0) && (y == 0))
			{
			break;
			}
			b[x] = -1;
			if (b[y] != -1)
			{
				b[y]++;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
		if (b[i] != -1)
		{
		p++;
		r = i;
		}
		}
		if (p != 1)
		{
			System.out.print("NOT FOUND");
		}
		else
		{
		if (b[r] == n - 1)
		{
		System.out.printf("%d",r);
		}
		else
		{
		System.out.print("NOT FOUND");
		}
		}
	}

}

