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
	x = 0;
	y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
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
	for (int i = 0;i < n;i++)
	{
		if (a[i] == 0)
		{
			if (b[i] == 0)
			{
				x = x;
				y = y;
			}
			if (b[i] == 1)
			{
				x++;
			}
			if (b[i] == 2)
			{
				y++;
			}
		}
		if (a[i] == 1)
		{
			if (b[i] == 1)
			{
				x = x;
				y = y;
			}
			if (b[i] == 2)
			{
				x++;
			}
			if (b[i] == 0)
			{
				y++;
			}
		}
		if (a[i] == 2)
		{
			if (b[i] == 2)
			{
				x = x;
				y = y;
			}
			if (b[i] == 0)
			{
				x++;
			}
			if (b[i] == 1)
			{
				y++;
			}
		}
	}
	if (x == y)
	{
		System.out.print("Tie");
	}
	if (x > y)
	{
		System.out.print("A");
	}
	if (x < y)
	{
		System.out.print("B");
	}
		return 0;
	}

}

