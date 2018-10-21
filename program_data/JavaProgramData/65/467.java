package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a = 0;
	int b = 0;
	int x;
	int y;
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
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
		if (x == 0)
		{
			if (y == 1)
			{
				a += 1;
			}
			else if (y == 2)
			{
				b += 1;
			}
		}
		else if (x == 1)
		{
			if (y == 2)
			{
				a += 1;
			}
			else if (y == 0)
			{
				b += 1;
			}
		}
		else if (x == 2)
		{
			if (y == 0)
			{
				a += 1;
			}
			else if (y == 1)
			{
				b += 1;
			}
		}
	}
	if (a > b)
	{
		System.out.print("A");
	}
	else if (a < b)
	{
		System.out.print("B");
	}
	else if (a == b)
	{
		System.out.print("Tie");
	}
	return 0;
	}
}

