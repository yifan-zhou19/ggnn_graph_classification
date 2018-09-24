package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[200];
		int[] b = new int[200];
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[n - 1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[n - 1] = Integer.parseInt(tempVar5);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == 0)
			{
				x = x + 1;
				y = y + 1;
			}
			if (a[i] == 0 && b[i] == 1)
			{
				x = x + 1;
			}
			if (a[i] == 0 && b[i] == 2)
			{
				y = y + 1;
			}
			if (a[i] == 1 && b[i] == 0)
			{
				y = y + 1;
			}
			if (a[i] == 1 && b[i] == 1)
			{
				x = x + 1;
				y = y + 1;
			}
			if (a[i] == 1 && b[i] == 2)
			{
				x = x + 1;
			}
			if (a[i] == 2 && b[i] == 0)
			{
				x = x + 1;
			}
			if (a[i] == 2 && b[i] == 1)
			{
				y = y + 1;
			}
			if (a[i] == 2 && b[i] == 2)
			{
				x = x + 1;
				y = y + 1;
			}
		}
		if (x > y)
		{
			System.out.print("A");
		}
		if (x < y)
		{
			System.out.print("B");
		}
		else if (x == y)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

