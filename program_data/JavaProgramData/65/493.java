package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	int a;
	int b;
	int x = 0;
	int y = 0;
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
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (a == 0 && b == 0)
		{
			x = x;
		}
		if (a == 0 && b == 1)
		{
			x++;
		}
		if (a == 0 && b == 2)
		{
			y++;
		}
		if (a == 1 && b == 0)
		{
			y++;
		}
		if (a == 1 && b == 1)
		{
			x = x;
		}
		if (a == 1 && b == 2)
		{
			x++;
		}
		if (a == 2 && b == 0)
		{
			x++;
		}
		if (a == 2 && b == 1)
		{
			y++;
		}
		if (a == 2 && b == 2)
		{
			x = x;
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
	if (x == y)
	{
		System.out.print("Tie");
	}

	return 0;
	}

}

